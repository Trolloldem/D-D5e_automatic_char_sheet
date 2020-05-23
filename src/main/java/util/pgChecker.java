package util;

import myLex.ddmLangParser;
import myLex.ddmLangParser.ClassVectorContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;
import parsingExceptions.pgMalformedException;
import util.lexEnum.Classi;
import util.lexEnum.Skills;
import util.lexEnum.subClass;
import wrappers.characterWrapper;
import wrappers.equipWrapper;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class pgChecker {
public static Set<String> setted;
    public static characterWrapper checkPgDefinition(List<ddmLangParser.PropertyContext> property,String characterName, ddmLangParser parser) {

        characterWrapper character = new characterWrapper();
        character.setName(characterName);
        switch (property.size()){
            case 7:
                for(ddmLangParser.PropertyContext prop : property){
                    Object mandatoryChild = prop.mandatory().getChild(0).getPayload();
                    Object value = prop.value().getChild(0).getPayload();
                    if(mandatoryChild instanceof Token){
                        selectOperationCase7(character, (Token)mandatoryChild,value, parser);
                    }else{
                        throw new pgMalformedException("Wrong mandatory property in line: "+prop.getStart().getLine());
                    }

                }
                break;
            case 12:
                for(ddmLangParser.PropertyContext prop : property){
                    Object mandatoryChild = prop.mandatory().getChild(0).getPayload();
                    Object value = prop.value().getChild(0).getPayload();
                    if(mandatoryChild instanceof Token){
                        selectOperationCase7(character, (Token)mandatoryChild,value, parser);
                    }else if(mandatoryChild instanceof ddmLangParser.StatIDContext){
                        selectOperationCase12(character, (ddmLangParser.StatIDContext)mandatoryChild,value, parser);;
                    }

                }
                break;
        }
        if(character.allSetted()){
            checkSkillPermitted(character);
            return character;
        }else {
            throw new pgMalformedException("The character named '"+character.getName()+"' misses the following properties: "+character.notSettedProperty());
        }
    }

    private static void checkSkillPermitted(characterWrapper character) {

        Set<Pair<Classi,subClass>> keyClasses = character.getPgClass().keySet();
        Set <Classi> allClass = keyClasses.stream().map(elem -> {return elem.a;}).collect(Collectors.toSet());
        Set<Skills> permittedSkils = new HashSet<Skills>();
        Map<Skills, Classi> permittedByOthers = new HashMap<>();
        Set<Classi> multiClassFlag = new HashSet<>();
        Classi firstClass = character.getSavingThrowClass();
        int totalSkills = firstClass.getNumSkills();
        for(Classi classe : allClass){
            if(classe.equals(firstClass) || classe.isAddSkillMulticlass())
                permittedSkils.addAll(Arrays.asList(classe.getProf()));
            if(!classe.equals(firstClass) && classe.isAddSkillMulticlass()){
                totalSkills = totalSkills + 1  ;
                for(Skills skill : classe.getProf()) {
                    if(!Arrays.asList(firstClass.getProf()).contains(skill))
                        permittedByOthers.put(skill, classe);
                }
            }
        }
        for(String skill: character.getSkills()){
            Skills enumSkill = Skills.valueOf(skill.replace(" ","_"));
            if(!permittedSkils.contains(enumSkill)){
                throw new pgMalformedException("Player '"+character.getName()+"' has skills not permitted by his classes. Permitted skills are: "+permittedSkils.toString());

            }
            if(permittedByOthers.containsKey(enumSkill)){
                if(multiClassFlag.contains(permittedByOthers.get(enumSkill)))
                    throw new pgMalformedException("Player '"+character.getName()+"' cannot have more than 1 skill provided by his multiclass.");
                else
                    multiClassFlag.add(permittedByOthers.get(enumSkill));
            }
        }
        if(character.getSkills().size() != totalSkills){
            throw new pgMalformedException("Player '"+character.getName()+"' has the wrong number of skills. Number of skills : "+totalSkills);
        }
        }


    private static void selectOperationCase12(characterWrapper character, ddmLangParser.StatIDContext mandatoryChild, Object value, ddmLangParser parser) {
        character.setSingleStat(mandatoryChild.getText(),Integer.parseInt(((Token)value).getText()) );
    }

    private static void selectOperationCase7(characterWrapper character, Token mandatoryChild, Object value, ddmLangParser parser) {
      if(mandatoryChild.getType() == parser.getTokenType("RACE")){
          character.setRace(((Token)value).getText());
          setted.add("race");
      }
      if(mandatoryChild.getType() == parser.getTokenType("HP")){
          Integer hp = Integer.parseInt(((Token)value).getText());
            character.setHp(hp);
          setted.add("hp");
      }
      if(mandatoryChild.getType() == parser.getTokenType("ALIGN")){
          character.setAlignment(((Token)value).getText());
          setted.add("alignment");
      }
      if(mandatoryChild.getType() == parser.getTokenType("LANG")){
            List<String > languages = new ArrayList<String>();
          ddmLangParser.LanguagesContext allLang = (ddmLangParser.LanguagesContext) value;
            for(TerminalNode lang : allLang.LANGUAGE()){
                languages.add(lang.getText());
            }

            character.setLanguages(languages);
          setted.add("languages");
      }
      if(mandatoryChild.getType() == parser.getTokenType("SKILLSID")){

            List<String > skills = new ArrayList<String>();
          ddmLangParser.SkillsContext allSkills = (ddmLangParser.SkillsContext) value;

            for(TerminalNode skill : allSkills.SKILL()){
                if(skills.contains(skill.getText())){
                    throw new pgMalformedException("The skill '"+skill.getText()+"' is specified multiple times for Player '"+character.getName()+"'");
                }
                skills.add(skill.getText());
            }

            character.setSkills(skills);
          setted.add("skills");
      }

      if(mandatoryChild.getType() == parser.getTokenType("ABILITY")){
            Map<String,Integer > scores = new HashMap<String, Integer>();
            String[] abilitiesName = {"STR","DEX","CON","INT","WIS","CHA"};
          ddmLangParser.AbilitiesContext allScores = (ddmLangParser.AbilitiesContext) value;
            int i = 0;
            for(TerminalNode score : allScores.DIGIT()){
                scores.put(abilitiesName[i],Integer.parseInt(score.getText()));
                i++;
            }
            character.setStats(scores);
            setted.addAll(Arrays.asList(abilitiesName));
      }
      if(mandatoryChild.getType() == parser.getTokenType("ARCHTYPE")){
          Map<Pair<Classi,subClass>, Integer> temp=new HashMap<Pair<Classi,subClass>, Integer>();
          List<String> classAlredySetted = new ArrayList<String>();
          ddmLangParser.ClassVectorContext classVector = (ClassVectorContext) value;
          ddmLangParser.ClassVectorElemContext allclass = classVector.classVectorElem();
          Classi savingThrow = null;
    	  while (allclass != null) {
              Classi tempClasse = Classi.valueOf(allclass.PGCLASS().getText());
              subClass tempSubclass = null;

              if (allclass.SUBCLASS() != null) {
                  String subClassName = allclass.SUBCLASS().getText().replace(' ', '_');
                  tempSubclass = subClass.valueOf(subClassName);
              }

              Pair<Classi, subClass> classes = new Pair<Classi, subClass>(tempClasse, tempSubclass);

              if(!classAlredySetted.contains(tempClasse.name())) {
                  classAlredySetted.add(tempClasse.name());
                  temp.put(classes, -1);

              }else {
                  throw new pgMalformedException("The class '"+tempClasse+"' is specified more than 1 time for Player '"+character.getName()+"'");
              }
              if(savingThrow == null)
                  savingThrow = tempClasse;
              allclass = allclass.classVectorElem();
          }
    	  character.setPgClass(temp);
    	  character.setSavingThrowClass(savingThrow);
          setted.add("archetype");
      }

    }
}

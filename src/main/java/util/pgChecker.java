package util;

import myLex.ddmLangParser;
import myLex.ddmLangParser.ClassVectorContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;
import parsingExceptions.pgMalformedException;
import util.lexEnum.Classi;
import util.lexEnum.subClass;
import wrappers.characterWrapper;
import wrappers.equipWrapper;

import java.util.*;

public class pgChecker {

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
            return character;
        }else {
            throw new pgMalformedException("The character named '"+character.getName()+"' misses the following properties: "+character.notSettedProperty());
        }
    }

    private static void selectOperationCase12(characterWrapper character, ddmLangParser.StatIDContext mandatoryChild, Object value, ddmLangParser parser) {
        character.setSingleStat(mandatoryChild.getText(),Integer.parseInt(((Token)value).getText()) );
    }

    private static void selectOperationCase7(characterWrapper character, Token mandatoryChild, Object value, ddmLangParser parser) {
      if(mandatoryChild.getType() == parser.getTokenType("RACE")){
          character.setRace(((Token)value).getText());
      }
      if(mandatoryChild.getType() == parser.getTokenType("HP")){
          Integer hp = Integer.parseInt(((Token)value).getText());
            character.setHp(hp);
      }
      if(mandatoryChild.getType() == parser.getTokenType("ALIGN")){
          character.setAlignment(((Token)value).getText());
      }
      if(mandatoryChild.getType() == parser.getTokenType("LANG")){
            List<String > languages = new ArrayList<String>();
          ddmLangParser.LanguagesContext allLang = (ddmLangParser.LanguagesContext) value;
            for(TerminalNode lang : allLang.LANGUAGE()){
                languages.add(lang.getText());
            }
            if(languages.size()==1 && !languages.toArray()[0].equals("Common")){
                languages.add("Common");
            }else if(languages.size()==1 && languages.toArray()[0].equals("Common")){
                throw new pgMalformedException("Only 1 language specified for Player '"+character.getName()+"'. If only one language is specified, it cannot be 'Common'");
            }
            if(languages.size()==2 && languages.toArray()[0].equals(languages.toArray()[1])){
                throw new pgMalformedException("The character must know 2 languages. The language '"+languages.toArray()[0]+"' is specified 2 times for Player '"+character.getName()+"'");
            }

            character.setLanguages(languages);
      }
      if(mandatoryChild.getType() == parser.getTokenType("SKILLSID")){

            List<String > skills = new ArrayList<String>();
          ddmLangParser.SkillsContext allSkills = (ddmLangParser.SkillsContext) value;
            for(TerminalNode skill : allSkills.SKILL()){
                skills.add(skill.getText());
            }
            if(skills.toArray()[1].equals(skills.toArray()[0])){
                throw new pgMalformedException("The character must have 2 skills. The skill '"+skills.toArray()[0]+"' is specified 2 times for Player '"+character.getName()+"'");
            }
            character.setSkills(skills);
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
      }
      if(mandatoryChild.getType() == parser.getTokenType("ARCHTYPE")){
          Map<Pair<Classi,subClass>, Integer> temp=new HashMap<Pair<Classi,subClass>, Integer>();
          List<String> classAlredySetted = new ArrayList<String>();
          ddmLangParser.ClassVectorContext classVector = (ClassVectorContext) value;
          ddmLangParser.ClassVectorElemContext allclass = classVector.classVectorElem();
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
              allclass = allclass.classVectorElem();
          }
    	  character.setPgClass(temp);
      }

    }
}

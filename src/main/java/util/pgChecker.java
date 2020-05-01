package util;

import myLex.digits4Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import parsingExceptions.pgMalformedException;
import wrappers.characterWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pgChecker {

    public static void checkPgDefinition(List<digits4Parser.PropertyContext> property,String characterName, digits4Parser parser) {
        characterWrapper character = new characterWrapper();
        character.setName(characterName);
        switch (property.size()){
            case 7:
                for(digits4Parser.PropertyContext prop : property){
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
                for(digits4Parser.PropertyContext prop : property){
                    Object mandatoryChild = prop.mandatory().getChild(0).getPayload();
                    Object value = prop.value().getChild(0).getPayload();
                    if(mandatoryChild instanceof Token){
                        selectOperationCase7(character, (Token)mandatoryChild,value, parser);
                    }else if(mandatoryChild instanceof digits4Parser.StatIDContext){
                        selectOperationCase12(character, (digits4Parser.StatIDContext)mandatoryChild,value, parser);;
                    }

                }
                break;
        }
        System.out.println(character);
    }

    private static void selectOperationCase12(characterWrapper character, digits4Parser.StatIDContext mandatoryChild, Object value, digits4Parser parser) {
        character.setSingleStat(mandatoryChild.getText(),Integer.parseInt(((Token)value).getText()) );
    }

    private static void selectOperationCase7(characterWrapper character, Token mandatoryChild, Object value, digits4Parser parser) {
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
            digits4Parser.LanguagesContext allLang = (digits4Parser.LanguagesContext) value;
            for(TerminalNode lang : allLang.LANGUAGE()){
                languages.add(lang.getText());
            }
            character.setLanguages(languages);
      }
      if(mandatoryChild.getType() == parser.getTokenType("SKILLSID")){
          // (Acrobatics,Acrobatics)
            List<String > skills = new ArrayList<String>();
            digits4Parser.SkillsContext allSkills = (digits4Parser.SkillsContext) value;
            for(TerminalNode skill : allSkills.SKILL()){
                skills.add(skill.getText());
            }
            character.setSkills(skills);
      }

      if(mandatoryChild.getType() == parser.getTokenType("ABILITY")){
            Map<String,Integer > scores = new HashMap<String, Integer>();
            String[] abilitiesName = {"STR","DEX","CON","INT","WIS","CHA"};
            digits4Parser.AbilitiesContext allScores = (digits4Parser.AbilitiesContext) value;
            int i = 0;
            for(TerminalNode score : allScores.DIGIT()){
                scores.put(abilitiesName[i],Integer.parseInt(score.getText()));
                i++;
            }
            character.setStats(scores);
      }
      if(mandatoryChild.getType() == parser.getTokenType("ARCHTYPE")){
            //TODO utilizzare metodo valerio per recupero vettore di classi/sottoclassi
      }

    }
}
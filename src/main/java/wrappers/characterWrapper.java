package wrappers;

import org.antlr.v4.runtime.misc.Pair;
import util.Races;
import util.classChecker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class characterWrapper {
    String name;
    Races race;
    Map<Pair<classChecker.Classi, classChecker.subClass>, Integer> pgClass;
    int hp;
    Map<String, Integer> stats;
    String alignment;
    List<String> skills;
    List<String> languages;
    int settedProperty;



    public characterWrapper(){
        settedProperty = 0;
        languages = new ArrayList<String>();
        skills = new ArrayList<String>();
        stats = new HashMap<String, Integer>();
    }


    public Boolean allSetted(){
        if(this.settedProperty == 12)
            return true;
        return false;
    }

    public Races getRace() {
        return race;
    }

    public void setRace(Races razza) {
        settedProperty++;
        this.race = razza;
    }

    public void setRace(String razza) {
        setRace(Races.valueOf(razza));
    }

    public Map<Pair<classChecker.Classi, classChecker.subClass>, Integer> getPgClass() {
        return pgClass;
    }

    public void setPgClass(Map<Pair<classChecker.Classi, classChecker.subClass>, Integer> pgClass) {
        settedProperty++;
        this.pgClass = pgClass;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        settedProperty++;
        this.hp = hp;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public void setStats(Map<String, Integer> stats) {
        settedProperty = settedProperty+ 6;
        this.stats = stats;
    }


    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        settedProperty++;
        this.alignment = alignment;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        settedProperty++;
        this.skills = skills;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        settedProperty++;
        this.languages = languages;
    }

    @Override
    public String toString() {
        String result = "Player "+this.name+"\n"+"{"+"\n"
                       +"race: "+this.race+"\n"
                       +"hp: "+this.hp+"\n"
                       +"alignment: "+this.alignment+"\n"
                       + "languages: (";
        result = addLang(result);
        result = result +"skills: (";
        result = addSkill(result);
        result = addAbilities(result);
        result = result + "}\n"
        +"TOREMOVE: setter->"+settedProperty;
        return result;
    }
    private String addLang(String result){
        for(int i=0;i<languages.size()-1;i++){
            result = result + languages.get(i) + ",";
        }
        if(languages.size()>0)
            result = result + languages.get(languages.size()-1);
        result = result + ")\n";
        return result;

    }

    private String addSkill(String result){
        for(int i=0;i<skills.size()-1;i++){
            result = result + skills.get(i) + ",";
        }
        if(skills.size()>0)
            result = result + skills.get(skills.size()-1);
        result = result + ")\n";
        return result;

    }

    private String addAbilities(String result){
        for(Map.Entry<String , Integer> score : stats.entrySet()){
            result = result + score.getKey() + ": "+score.getValue() +"\n";
        }
        return result;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSingleStat(String statName, Integer value) {
        if(! stats.containsKey(statName)){
            stats.put(statName, value);
            settedProperty++;
        }
    }



}

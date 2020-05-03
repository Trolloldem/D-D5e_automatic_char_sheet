package wrappers;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class equipWrapper {
    private  String  name;
    private String armor;
    private String weapon;
    private boolean shield;
    private Map<String, Integer> consumable;


    public equipWrapper(String name){
        this.name = name;
        this.consumable = new HashMap<String, Integer>();
        shield = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    public Map<String, Integer> getConsumable() {
        return consumable;
    }

    public void setConsumable(Map<String, Integer> consumable) {
        this.consumable = consumable;
    }

    @Override
    public String toString() {
        String result = "Equipment "+this.name+"\n{\n";
        if(armor!=null)
            result = result+ "armor: "+ armor+"\n";
        if(weapon!=null)
            result = result +"weapon: " +weapon+"\n";
        if(shield){
            result = result + "shield: Yes\n";

        }else{
            result = result + "shield: No\n";

        }

        if(consumable.keySet().size()!=0){
            result = result + "consumables: (";
            for(Map.Entry<String,Integer> entry : consumable.entrySet()){
                result = result + entry.getKey()+"*"+entry.getValue()+",";
            }
            result = result.substring(0,result.length()-1) +")\n";
        }
        result = result + "}";
        return result;
    }
}

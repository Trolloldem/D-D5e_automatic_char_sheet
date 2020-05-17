package util.lexEnum;

public enum Races {
    Dragonborn(30, new String[] {"Common", "Draconic"},0),
    Dwarf(25, new String[] {"Common", "Dwarvish"},0),
    Elf(30, new String[] {"Common","Elvish"},0),
    Gnome(25, new String[] {"Common", "Gnomish" },0),
    Half_Elf(30, new String[] {"Common","Elvish"},1),
    Halfling(25, new String[] {"Common", "Halfling"},0),
    Half_Orc(30, new String[] {"Common","Orc"},0),
    Human(30, new String[] {"Common"},1),
    Tiefling(30, new String[] {"Common","Infernal"},0);

   private int speed;
   private String[] languages;
   private  int extraLang;

    Races(int speed, String [] lang, int extraLang){
    this.speed = speed;
    this.languages = lang;
    this.extraLang = extraLang;
   }

   public int getSpeed(){
     return speed;
   }

   public String[] getLanguages(){
     return languages;
   }

 public int getExtraLang() {
  return extraLang;
 }
}

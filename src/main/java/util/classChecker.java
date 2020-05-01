package util;


import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.runtime.Token;
import org.antlr.v4.runtime.Token;

import myLex.digits4Parser;
import parsingExceptions.malformedProperty;
import parsingExceptions.notSubclass;



public class classChecker {
	
	Classi c;

   public enum Classi{
    	Barbarian(new subClass[] {subClass.Berserker, subClass.Path_of_the_Totem_warrior}),
    	Bard(new subClass[] {subClass.College_of_Lore, subClass.College_of_Valor }),
    	Cleric(new subClass[] {subClass.Knowledge_Domain,subClass.Life_Domain,subClass.Light_Domain,
    			subClass.Nature_Domain,subClass.Tempest_Domain,subClass.Trickery_Domain,
    			subClass.War_Domain}),
    	Druid(new subClass[] {subClass.Circle_of_the_land,subClass.Circle_of_the_moon}),
    	Fighter(new subClass[] {subClass.Champion, subClass.Battle_master, subClass.Eldritch_knight}),
    	Monk(new subClass[] {subClass.Way_of_the_open_hand, subClass.Way_of_shadow, subClass.Way_of_the_four_elements }),
    	Paladin(new subClass[] {subClass.Oath_of_devotion, subClass.Oath_of_the_ancients,subClass.Oath_of_vengeance}),
    	Ranger(new subClass[] {subClass.Hunter, subClass.Beast_master}),
    	Rogue(new subClass[] {subClass.Thief,subClass.Assassin,subClass.Arcane_trickster}),
    	Sorcerer(new subClass[] {subClass.Dragonic_bloodline, subClass.Wild_magic}),
    	Warlock(new subClass[] {subClass.The_fiend,subClass.the_archfey,subClass.The_great_old_one}),
    	Wizard(new subClass[] {subClass.School_of_abjuration, subClass.School_of_divination, subClass.School_of_enchantment,
    			subClass.School_of_conjuration, subClass.School_of_evocation, subClass.School_of_illusion,
    			subClass.School_of_necromancy, subClass.School_of_transmutation});
    	
    	public subClass[] subClasses;
   	 	Classi(subClass[] sub){
	    	this.subClasses=sub;
	    }
   	 	
   	 	public subClass[] getsubClass() {
			return subClasses;
   	 		
   	 	}
    }
    
        
   public classChecker(Classi c) {
	   this.c=c;
   }
     
   public Classi getClassi() {
	   return c;
   }
   public void setC(Classi c) {
	this.c = c;
}

public enum subClass{
	Berserker,
	Path_of_the_Totem_warrior,
	College_of_Lore,
	College_of_Valor,
	Knowledge_Domain,
	Life_Domain,
	Light_Domain,
	Nature_Domain,
	Tempest_Domain,
	Trickery_Domain,
	War_Domain,
	Circle_of_the_land,
	Circle_of_the_moon,
	Champion,
	Battle_master,
	Eldritch_knight,
	Way_of_the_open_hand,
	Way_of_shadow,
	Way_of_the_four_elements,
	Oath_of_devotion,
	Oath_of_the_ancients,
	Oath_of_vengeance,
	Hunter,
	Beast_master,
	Thief,
	Assassin,
	Arcane_trickster,
	Dragonic_bloodline,
	Wild_magic,
	The_fiend,
	The_great_old_one,
	the_archfey,
	School_of_abjuration,
	School_of_conjuration,
	School_of_divination,
	School_of_enchantment,
	School_of_evocation,
	School_of_illusion,
	School_of_necromancy,
	School_of_transmutation;


}



	public static void checkClass(CommonTokenStream tokens){
   
        for( Classi check:Classi.values()){
        	
        	for(subClass temp:check.subClasses) {
            if (tokens.getText().equals(check.name()) || tokens.getText().equals(temp.name())){
                System.out.println("Il personaggio � della classe:"+tokens.getText());
                return;

            }
        }
        }
        System.out.println("Il personaggio non � di una classe valida");
        return;
        }
    
    public static void check(digits4Parser.ClassVectorElemContext ctx) {
    	Object mandaToryChild = ctx.getChild(0).getPayload();
    	Token mandatoryToken = (Token) mandaToryChild;
    	String C = ctx.PGCLASS().getText();
    	boolean flag=false;
    	if(ctx.SUBCLASS()!= null) {
    		String S = ctx.SUBCLASS().getText();
    		S = S.replace(' ','_');
    		for( Classi check:Classi.values()){
    			if(C.equals(check.name())) {
    				for(subClass tempo:check.subClasses) {
    					if(S.equals(tempo.name())) {

    						flag=true;
    				 }
    			 }
    		 }
    	 }
            if(flag==false)
            	throw new notSubclass("LA SOTTOCLASSE NON APPARTIENE ALLA CLASSE "+mandatoryToken.getLine());
    }else
    	System.out.println("SOTTOCLASSE NON PRESENTE");
    }
    };
  
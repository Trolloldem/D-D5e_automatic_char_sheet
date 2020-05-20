package documentProducer;

import com.company.Main;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.cos.COSString;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import util.lexEnum.*;
import wrappers.characterWrapper;
import wrappers.equipWrapper;
import wrappers.semanticResult;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import org.antlr.v4.runtime.misc.Pair;




public class ddmProducer {

    private static final int firstCheckBoxSkills = 23;
    private static final int lastCheckBoxSkills = 40;

    public static final String PDFPath = "./src/main/resources/charsheet.pdf";

    public static void produceDocument(Map<String, semanticResult> mappaPgNames, Map<String, semanticResult> mappaEquipNames, String[] args) throws IOException {

        InputStream in = Main.class.getResourceAsStream("/charsheet.pdf");
        PDDocument document;
        if(in == null) {

            File file = new File(PDFPath);
            document = PDDocument.load(file);
        }else{

            document = PDDocument.load(in);
        }

        for(Map.Entry<String,semanticResult> entry : mappaPgNames.entrySet())
            processWriting(document, entry.getKey(), (characterWrapper) entry.getValue() );

        document.close();


    }

    private static void processWriting(PDDocument original,String name ,characterWrapper pg) throws IOException {
        original.save("./src/test/outputs/"+name+".pdf");

        File file = new File("./src/test/outputs/"+name+".pdf");
        PDDocument document = PDDocument.load(file);

        PDDocumentCatalog docCatalog = document.getDocumentCatalog();
        PDAcroForm acroForm = docCatalog.getAcroForm();

        processCharWrapper(acroForm, name, pg);

        document.save(new File("./src/test/outputs/"+name+".pdf"));
        document.close();

    }

    private static void processScores(PDAcroForm acroForm, characterWrapper pg) throws IOException {

        PDField field;
        for(Abilities score : Abilities.values()) {
            //Set scores
            field = acroForm.getField(score.name());
            field.setValue(Integer.toString(pg.getStats().get(score.name())));


            //Set modifiers, special case because Acroform not well formatted
            if (score.name().equals("CHA"))
                field = acroForm.getField("CHamod");
            else if (score.name().equals("DEX"))
                field = acroForm.getField(score.name() + "mod ");
            else
                field = acroForm.getField(score.name() + "mod");

            field.setValue(Integer.toString(pg.getBonus().get(score.name())));
        }
    }

    private static void processClassLevel(PDAcroForm acroForm, characterWrapper pg) throws  IOException {

        PDField field;
        field = acroForm.getField("ClassLevel");
        String classField = "";
        for(Map.Entry<Pair<Classi, subClass>,Integer> entry: pg.getPgClass().entrySet()){
            if(entry.getKey().b == null){
                classField = classField + entry.getKey().a.toString().replace("_"," ")+":"+entry.getValue()+", ";
            }else {
                classField = classField + entry.getKey().b.toString().replace("_"," ")+":"+entry.getValue()+", ";
            }
        }
        classField = classField.substring(0,classField.length()-2);
        field.setValue(classField);
    }

    private static void processSaving(PDAcroForm acroForm,characterWrapper pg) throws IOException{

        PDField field;
        //Set savingThrows
        Abilities[] saving = pg.getSavingThrowClass().getSavingThrows();
        for(Abilities ab : saving){
            field = acroForm.getField("Check Box "+ab.getPdfFormCheckBox());
            ((PDCheckBox) field).check();
            field = acroForm.getField("ST "+ab.getDescr());
            int value = pg.getProficiencyBonus() + pg.getBonus().get(ab.name());
            field.setValue(Integer.toString(value));
        }

        for(Abilities ab : Abilities.values()){
            if(!Arrays.asList(saving).contains(ab)){
                field = acroForm.getField("ST "+ab.getDescr());
                int value = pg.getBonus().get(ab.name());
                field.setValue(Integer.toString(value));
            }

        }
    }


    private static void processSkills(PDAcroForm acroForm, characterWrapper pg) throws IOException {
        PDField field;

        List<String > skills = pg.getSkills();
        Set<Skills> alreadySet = new HashSet<Skills>();

        for(String skill: skills){
            Skills enumSkill = Skills.valueOf(skill.replace(" ","_"));
            int value = pg.getProficiencyBonus() + pg.getBonus().get(enumSkill.getAbility().name());
            field = acroForm.getField(skill.replace(" ",""));
            if(skill.equals("Animal Handling"))
                field = acroForm.getField("Animal");
            if(skill.equals("Deception") || skill.equals("History")|| skill.equals("Investigation") || skill.equals("Perception") || skill.equals("Stealth"))
                field = acroForm.getField(skill.replace(" ","")+" ");



            field.setValue(Integer.toString(value));

            field = acroForm.getField("Check Box "+enumSkill.getCheckBox());
            ((PDCheckBox) field).check();
            alreadySet.add(enumSkill);
        }

        if(pg.getBackground()!=null){
            for(Skills skill : pg.getBackground().getSkills()){
                int value = pg.getProficiencyBonus() + pg.getBonus().get(skill.getAbility().name());
                field = acroForm.getField(skill.name().replace("_",""));
                if(skill.equals(Skills.Animal_Handling))
                    field = acroForm.getField("Animal");
                if(skill.equals(Skills.Deception) || skill.equals(Skills.History)|| skill.equals(Skills.Investigation) || skill.equals(Skills.Perception) || skill.equals(Skills.Stealth))
                    field = acroForm.getField(skill.name().replace("_","")+" ");



                field.setValue(Integer.toString(value));

                field = acroForm.getField("Check Box "+skill.getCheckBox());
                ((PDCheckBox) field).check();
                alreadySet.add(skill);
            }

        }

        for(Skills skill : Skills.values()){
            if(!alreadySet.contains(skill)){
                int value = pg.getBonus().get(skill.getAbility().name());
                field = acroForm.getField(skill.name().replace("_",""));
                if(skill.equals(Skills.Animal_Handling))
                    field = acroForm.getField("Animal");
                if(skill.equals(Skills.Deception) || skill.equals(Skills.History) || skill.equals(Skills.Investigation) || skill.equals(Skills.Perception) || skill.equals(Skills.Stealth))
                    field = acroForm.getField(skill.name().replace("_","")+" ");




                field.setValue(Integer.toString(value));
                alreadySet.add(skill);
            }
        }
    }

    private static void processAC(PDAcroForm acroForm,characterWrapper pg) throws IOException{
        PDField field;
        int value;
        if(pg.getActiveEquip() != null){
            equipWrapper equip = pg.getActiveEquip();
            if(equip.getArmor().getScaling()!= null){
                value = equip.getArmor().getArmorClass() + pg.getBonus().get(equip.getArmor().getScaling().toString());
            }else if(equip.getArmor()!= Armors.None){
                value = equip.getArmor().getArmorClass();
            }else
                value = 10 + pg.getBonus().get("DEX");

        }else
            value = 10 + pg.getBonus().get("DEX");
        if(pg.getActiveEquip()!=null && pg.getActiveEquip().getShield().equals(Shields.Yes))
        	value=value+2;
        field = acroForm.getField("AC");
        field.setValue(Integer.toString(value));
    }
    private static void processCharWrapper(PDAcroForm acroForm, String name, characterWrapper pg) throws IOException {

        PDField field = acroForm.getField("CharacterName");
        field.setValue(name);

        field = acroForm.getField("PlayerName");
        field.setValue(name);

        //Set ability scores
        processScores(acroForm,pg);

        //Set alignment
        field = acroForm.getField("Alignment");
        field.setValue(pg.getAlignment());

        //Set Race
        field = acroForm.getField("Race ");
        field.setValue(pg.getRace().toString().replace("_"," "));

        //Set level for each class
        processClassLevel(acroForm,pg);


        //Set proficiency
        field = acroForm.getField("ProfBonus");
        field.setValue(Integer.toString(pg.getProficiencyBonus()));

        //Set saving throws
        processSaving(acroForm,pg);

        //Set skills
        processSkills(acroForm,pg);

        //Set initiative
        field = acroForm.getField("Initiative");
        field.setValue(Integer.toString(pg.getBonus().get("DEX")));

        //Set passive perception
        field = acroForm.getField("Perception ");
        int value = 10 + Integer.parseInt(field.getValueAsString());
        field = acroForm.getField("Passive");
        field.setValue(Integer.toString(value));

        //Set CA
        processAC(acroForm,pg);

        //Set HP
        field = acroForm.getField("HPMax");
        field.setValue(Integer.toString(pg.getHp()));
        field = acroForm.getField("HPCurrent");
        field.setValue(Integer.toString(pg.getHp()));

        //set Wpn
        processWeapons(acroForm, pg);
        
        //set lang
        processLang(acroForm,pg);
        
        equip(acroForm,pg);
  
        }


    private static void processWeapons(PDAcroForm acroForm, characterWrapper pg) throws IOException {
    	PDField field;
    	int i=1;
    	int j=1;
    	int value;
    	List<equipWrapper> entrys = new ArrayList<equipWrapper>();
    	for(Map.Entry<String, equipWrapper> temp:pg.getEquipments().entrySet()) {
    		if(temp.getValue().getWeapon().equals(Weapons.None)==false && entrys.size()<3) 
    			entrys.add(temp.getValue());
    	}
    	for(int k=0;k<entrys.size();k++) {
    		if(i==1) {
    		if(entrys.get(k).getWeapon().equals(Weapons.None)==false) {
    		Weapons temp =entrys.get(k).getWeapon();
    		value =pg.getBonus().get(temp.getScaling().toString());
    		field=acroForm.getField("Wpn Name");
    		field.setValue(temp.name().replace("_", " "));
    		field=acroForm.getField("Wpn1 AtkBonus");
    		field.setValue("+"+ value);
    		field=acroForm.getField("Wpn1 Damage");
    		field.setValue(temp.getValue());
    		}
    		}
    		else {
    			
    			Weapons temp =entrys.get(k).getWeapon();
    			value =pg.getBonus().get(temp.getScaling().toString());
        		field=acroForm.getField("Wpn Name "+i);
        		field.setValue(temp.name().replace("_", " "));
        		if(j==2) {
        		field=acroForm.getField("Wpn"+i +" AtkBonus ");
        		field.setValue("+"+ value);
        		}else {
        			field=acroForm.getField("Wpn"+i +" AtkBonus  ");
            		field.setValue("+"+ value);
        		}
        		field=acroForm.getField("Wpn"+j+ " Damage ");
        		field.setValue(temp.getValue());
        	
    		}
    		
    		i++;
    		j++;
    	}
    	
    }
    private static void processLang(PDAcroForm acroForm, characterWrapper pg) throws IOException {
    	PDField field;
    	String result = "Languages:\n";
    	for(int i=0;i<pg.getLanguages().size();i++) {
    	    result= result+ (i+1)+")"+ pg.getLanguages().get(i)+"\n";
    	}
    	field=acroForm.getField("ProficienciesLang");
        COSDictionary dict = field.getCOSObject();
        COSString defaultAppearance = (COSString) dict
                .getDictionaryObject(COSName.DA);
        if (defaultAppearance != null)
        {

            dict.setString(COSName.DA, "/RobotoCondensed 10 Tf 2 Tr .5 w 0 g");

        }
    	field.setValue(result);
    }
    
    private static void equip(PDAcroForm acroForm, characterWrapper pg) throws IOException {
    	PDField field;
    	String temp="";
    	int gold=0;
    	int hpotion=0;
    	int mpotion=0;
    	String golden="";
    	Boolean shield=false;
    	for(Map.Entry<String, equipWrapper> entrys:pg.getEquipments().entrySet()) {
    	temp=temp+entrys.getValue().getWeapon()+'\n';
    	if(shield==false && entrys.getValue().getShield().equals(Shields.Yes)){
    		temp= temp + "shield" +'\n';
    		shield=true;
    	}
    	if(entrys.getValue().getArmor().equals(Armors.None)==false) {
    			temp=temp+entrys.getValue().getArmor()+'\n';
    	}
    	for(Map.Entry<Consumables, Integer> con:entrys.getValue().getConsumables().entrySet()) {
    		if(con.getKey().equals(Consumables.Health_potion)) 
    			hpotion = hpotion+ con.getValue();
    		if(con.getKey().equals(Consumables.Mana_potion)) 
    			mpotion = mpotion+ con.getValue();
    		if(con.getKey().equals(Consumables.Gold)) 
    			gold = gold+ con.getValue();
    	}
    	
    	}
    	if(hpotion!=0)
    	temp=temp+ "Health Potion: "+hpotion + '\n';
    	if(mpotion!=0)
        temp=temp+ "Mana Potion: "+mpotion + '\n';
    	temp=temp.replaceAll("_", " ");
    	field=acroForm.getField("Equipment");
		field.setValue(temp);
		field=acroForm.getField("GP");
		field.setValue(" "+gold);
    }
}

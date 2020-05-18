package documentProducer;

import com.company.Main;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import util.lexEnum.Abilities;
import util.lexEnum.Classi;
import util.lexEnum.Skills;
import util.lexEnum.subClass;
import wrappers.characterWrapper;
import wrappers.semanticResult;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
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

                field = acroForm.getField("Check Box "+skill.getCheckBox());
                ((PDCheckBox) field).check();
                alreadySet.add(skill);
            }
        }
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


        }




}

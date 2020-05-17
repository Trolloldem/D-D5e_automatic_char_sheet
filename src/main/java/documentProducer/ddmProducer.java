package documentProducer;

import com.company.Main;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import util.lexEnum.Abilities;
import util.lexEnum.Classi;
import util.lexEnum.subClass;
import wrappers.characterWrapper;
import wrappers.semanticResult;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.antlr.v4.runtime.misc.Pair;




public class ddmProducer {


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

    private static void processCharWrapper(PDAcroForm acroForm, String name, characterWrapper pg) throws IOException {

        PDField field = acroForm.getField("CharacterName");
        field.setValue(name);

        field = acroForm.getField("PlayerName");
        field.setValue(name);

        for(Abilities score : Abilities.values()){
            //Set scores
            field = acroForm.getField(score.name());
            field.setValue(Integer.toString(pg.getStats().get(score.name())));

            //Set modifiers, special case because Acroform not well formatted
            if(score.name().equals("CHA"))
                field = acroForm.getField("CHamod");
            else if(score.name().equals("DEX"))
                field = acroForm.getField(score.name()+"mod ");
            else
                field = acroForm.getField(score.name()+"mod");

            field.setValue(Integer.toString(pg.getBonus().get(score.name())));

            //Set alignment
            field = acroForm.getField("Alignment");
            field.setValue(pg.getAlignment());

            //Set alignment
            field = acroForm.getField("Race ");
            field.setValue(pg.getRace().toString().replace("_"," "));

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
    }

}

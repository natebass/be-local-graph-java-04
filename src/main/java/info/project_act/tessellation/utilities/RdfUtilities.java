package info.project_act.tessellation.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;
import org.apache.jena.riot.RDFWriter;
import org.apache.jena.riot.SysRIOT;

public class RdfUtilities {
    public static void Write01(Model model, OutputStream out) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("showXmlDeclaration", "true");
        properties.put("tab", "2");

        // Model marray[];
        RDFWriter.create()
                .format(RDFFormat.RDFXML)
                .set(SysRIOT.sysRdfWriterProperties, properties)
                .source(model)
                .output(out);
    }

    public static void Write02(Model model, OutputStream out) {
        RDFDataMgr.write(out, model, RDFFormat.RDFXML);
    }

    public static void ConvertDoapN3ToRdf(String[] args) {
        String inputFilePath = args[0];
        String outputFilePath = args[1];

        Model model = ModelFactory.createDefaultModel();
        Map<String, Object> properties = new HashMap<>();
        properties.put("showXmlDeclaration", "true");
        properties.put("tab", "2");

        try (FileInputStream in = new FileInputStream(inputFilePath)) {
            model.read(in, null, "N3");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream out = new FileOutputStream(outputFilePath)) {
            Write01(model, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void MergeTwoRdf(String[] args) {
        // WARNING: Temporary file path for testing.
        var testFilePath = args[0];
        var testFilePath2 = args[1];
        var testFilePath3 = args[2];

        // Create an empty model
        Model model1 = ModelFactory.createDefaultModel();
        Model model2 = ModelFactory.createDefaultModel();

        // Read the first RDF file
        InputStream in1 = RDFDataMgr.open(testFilePath);
        model1.read(in1, null);

        // Read the second RDF file
        InputStream in2 = RDFDataMgr.open(testFilePath2);
        model2.read(in2, null);

        // Add the second model to the first model
        model1.add(model2);

        // Write the combined model to a new RDF file
        try (OutputStream out = new FileOutputStream(testFilePath3)) {
            model1.write(out, "RDF/XML");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package info.project_act.tessellation.utilities;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;

import java.io.*;

public class RdfUtilities {
    public static void ConvertDoapN3ToRdf(String[] args) {
        // Define the input and output file paths
        String inputFilePath = args[0];
        String outputFilePath = args[1];

        // Create an empty model
        Model model = ModelFactory.createDefaultModel();

        // Read the N3 file into the model
        try (FileInputStream in = new FileInputStream(inputFilePath)) {
            model.read(in, null, "N3");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the model to an RDF file in RDF/XML format
        try (FileOutputStream out = new FileOutputStream(outputFilePath)) {
            RDFDataMgr.write(out, model, RDFFormat.RDFXML);
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

package info.project_act.tessellation;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.sparql.vocabulary.FOAF;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * A class that demonstrates reading and writing RDF data using Jena.
 */
public class JenaExample {
    public static void MergeExample(String[] args) {
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

    public static void ReadExample() {
        Model model = ModelFactory.createDefaultModel();
        InputStream in = RDFDataMgr.open("src/main/resources/doap.rdf");
        model.read(in, null);
        model.write(System.out);
    }

    public static void WriteExampleRDF(String[] args) {
        // WARNING: Temporary file path for testing.
        var testFilePath = args[0];
        Model model = ModelFactory.createDefaultModel();
        String doapNS = "http://usefulinc.com/ns/doap#";
        String foafNS = "http://xmlns.com/foaf/0.1/";

        // Set custom namespace prefixes doap and foaf. The default is j.1, j.2.
        model.setNsPrefix("doap", doapNS);
        model.setNsPrefix("foaf", foafNS);

        Resource project = model.createResource("https://project-act.info/projects/ov-tessellation")
                .addProperty(model.createProperty(doapNS, "name"), "Tessellation Project Overview")
                .addProperty(model.createProperty(doapNS, "shortdesc"), "The goal of the Tessellation Project is to establish an opt-in, decentralized means of project discovery to capture, communicate, and collaborate.")
                .addProperty(model.createProperty(doapNS, "description"), "The Tessellation Overview is a starting point for specification, documentation, and ideation toward development of essential and useful components which will make up a functional system of opt-in advertisement of organization and project participants in one or more development communities to facilitate collaboration without a top down management infrastructure.")
                .addProperty(model.createProperty(doapNS, "homepage"), model.createResource("https://github.com/Project-ACT/ov-tessellation"))
                .addProperty(model.createProperty(doapNS, "bug-database"), model.createResource("https://github.com/Project-ACT/ov-tessellation/issues"))
                .addProperty(model.createProperty(doapNS, "Specification"), model.createResource("https://github.com/Project-ACT/ov-tessellation/tree/main/doc"))
                .addProperty(model.createProperty(doapNS, "license"), model.createResource("http://spdx.org/licenses/GPL-3.0-only"));

        Resource maintainer = model.createResource("https://project-act.info/people/DevOps")
                .addProperty(FOAF.name, "DevOps - Project-ACT")
                .addProperty(FOAF.homepage, model.createResource("https://github.com/DevOps-Project-ACT"))
                .addProperty(FOAF.mbox, model.createResource("mailto:devops@project-act.info"));

        project.addProperty(model.createProperty(doapNS, "maintainer"), maintainer);

        Resource documenter = model.createResource("https://project-act.info/people/DanHugo")
                .addProperty(FOAF.name, "Dan Hugo")
                .addProperty(FOAF.homepage, model.createResource("https://github.com/DanHugoDanHugo"))
                .addProperty(FOAF.mbox, model.createResource("mailto:dhugo@reallycool.com"));

        project.addProperty(model.createProperty(doapNS, "documenter"), documenter);

        Resource repository = model.createResource("https://project-act.info/projects/ov-tessellation/repo")
                .addProperty(model.createProperty(doapNS, "location"), model.createResource("https://github.com/Project-ACT/ov-tessellation.git"))
                .addProperty(model.createProperty(doapNS, "browse"), model.createResource("https://github.com/Project-ACT/ov-tessellation"));

        project.addProperty(model.createProperty(doapNS, "repository"), repository);

        project.addProperty(FOAF.maker, model.createResource("https://project-act.info/people/DanHugo"));

        try (OutputStream out = new FileOutputStream(testFilePath)) {
            model.write(out, "RDF/XML");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

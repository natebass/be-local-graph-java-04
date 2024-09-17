package info.project_act.tessellation;

import static info.project_act.tessellation.JenaExample.ReadExample;
import static info.project_act.tessellation.JenaExample.WriteExampleRDF;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a new RDF file based off the content ov-tessellation doap.rdf.
        WriteExampleRDF(new String[]{"src/main/resources/gen02.rdf"});
        ReadExample();
//        MergeExample(new String[]{"src/main/resources/doap.rdf", "src/main/resources/gen02.rdf", "src/main/resources/merged.rdf"});
    }

}


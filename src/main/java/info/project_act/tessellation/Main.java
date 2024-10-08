package info.project_act.tessellation;

import info.project_act.tessellation.cmd.ProjectAnalyzerCommand;
import picocli.CommandLine;

import static info.project_act.tessellation.feature.example.LocalFileExample.ReadExample;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a new RDF file based off the content ov-tessellation doap.rdf.
//        WriteExampleRDF(new String[]{"src/main/resources/gen02.rdf"});
        ReadExample(new String[]{"src/main/resources/doap.rdf"});
//        MergeExample(new String[]{"src/main/resources/doap.rdf", "src/main/resources/gen02.rdf", "src/main/resources/merged.rdf"});
        int exitCode = new CommandLine(new ProjectAnalyzerCommand()).execute(args);
        System.exit(exitCode);
    }

}


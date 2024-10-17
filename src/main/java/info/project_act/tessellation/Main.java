package info.project_act.tessellation;

import info.project_act.tessellation.cmd.ProjectAnalyzerCommand;
import picocli.CommandLine;

public class Main {
    public static void main(String[] args) throws Exception {
        int exitCode = new CommandLine(new ProjectAnalyzerCommand()).execute(args);
        System.exit(exitCode);
    }
}

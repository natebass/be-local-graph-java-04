package info.project_act.tessellation.cmd;

import info.project_act.tessellation.feature.workingdirectory.ProjectAnalyzer;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import static info.project_act.tessellation.feature.github.Github.GetGithubProject;
import static info.project_act.tessellation.feature.workingdirectory.ProjectAnalyzer.AnalyzeWorkingDirectory;

@Command(name = "analyze", description = "Analyzes the project directory")
public class ProjectAnalyzerCommand implements Runnable {

    @Parameters(index = "0", description = "Command to execute.")
    private String command;

    @CommandLine.Option(names = {"-d", "--directory"}, description = "The project directory to analyze.")
    private String projectDir;

    @CommandLine.Option(names = {"-l", "--lang"}, description = "Specify the programming language used by project.")
    private String language;

    @CommandLine.Option(names = {"-g", "--github"}, description = "Specify the github URL of the project.")
    private String githubUrl;

    @Override
    public void run() {
        switch (command) {
            case "local":
                AnalyzeWorkingDirectory(new String[]{projectDir, language});
                break;
            case "github":
                GetGithubProject(new String[]{projectDir});
                break;
            default:
                System.out.println("Invalid command: " + command);
        }
    }
}
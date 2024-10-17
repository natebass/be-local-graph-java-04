package info.project_act.tessellation.cmd;

import static info.project_act.tessellation.feature.github.Github.GetGithubProject;
import static info.project_act.tessellation.feature.workingdirectory.ProjectAnalyzer.AnalyzeWorkingDirectory;
import static info.project_act.tessellation.utilities.RdfUtilities.ConvertDoapN3ToRdf;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "analyze", description = "Analyzes the project directory")
public class LocalGraphCommand implements Runnable {

    @Parameters(index = "0", description = "Command to execute.")
    private String command;

    @CommandLine.Option(names = { "-n", "--n3" }, description = "Generate RDF file from n3.")
    private String n3FilePath;

    @CommandLine.Option(names = { "-d", "--directory" }, description = "The project directory to analyze.")
    private String projectDir;

    @CommandLine.Option(names = { "-l", "--lang" }, description = "Specify the programming language used by project.")
    private String language;

    @CommandLine.Option(names = { "-g", "--github" }, description = "Specify the GitHub URL of the project.")
    private String githubUrl;

    @Override
    public void run() {
        switch (command) {
            case "local":
                AnalyzeWorkingDirectory(new String[] { projectDir, language });
                break;
            case "github":
                GetGithubProject(new String[] { projectDir });
                break;
            case "convert":
                ConvertDoapN3ToRdf(new String[] { n3FilePath, "doapn3.rdf" });
                break;
            default:
                System.out.println("Invalid command: " + command);
        }
    }
}
package info.project_act.tessellation.cmd;

import static info.project_act.tessellation.feature.github.Github.GetGithubProject;
import static info.project_act.tessellation.feature.workingdirectory.ProjectAnalyzer.AnalyzeWorkingDirectory;
import static info.project_act.tessellation.utilities.RdfUtilities.ConvertDoapN3ToRdf;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

/**
 * The LocalGraphCommand class is a command-line tool that analyzes project
 * directories.
 * It supports various commands and options to perform different types of
 * analysis.
 * 
 * Commands:
 * - "local": Analyzes the specified project directory.
 * - "github": Fetches and analyzes a project from a specified GitHub URL.
 * - "convert": Converts an N3 file to RDF format.
 * 
 * Options:
 * - -n, --n3: Specifies the path to the N3 file to be converted to RDF.
 * - -d, --directory: Specifies the project directory to analyze.
 * - -l, --lang: Specifies the programming language used by the project.
 * - -g, --github: Specifies the GitHub URL of the project.
 * 
 * Usage:
 * java -jar your-jar-file.jar analyze <command> [options]
 * 
 * Example:
 * java -jar your-jar-file.jar analyze local -d /path/to/project -l java
 * java -jar your-jar-file.jar analyze github -g https://github.com/user/repo
 * java -jar your-jar-file.jar analyze convert -n /path/to/file.n3
 */
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
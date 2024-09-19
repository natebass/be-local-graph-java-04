package info.project_act.tessellation.feature.workingdirectory;


import static info.project_act.tessellation.feature.workingdirectory.Git.analyzeGit;

public class ProjectAnalyzer {
    public static void AnalyzeWorkingDirectory(String[] args) {
        String projectDir = args[0];
        String language = args[1];

        analyzeGit(projectDir);

        switch (language) {
            case "java":
                Java.DetectLanguageAndFramework(projectDir);
                break;
            default:
                Java.DetectLanguageAndFramework(projectDir);
                System.out.println("Invalid language: " + language + ". Defaulting to Java.");
        }
    }
}

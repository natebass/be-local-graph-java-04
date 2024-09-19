package info.project_act.tessellation.feature.workingdirectory;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Java {
    public static void DetectProject(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ProjectAnalyzer <project-directory>");
            return;
        }

        String projectDir = args[0];
        DetectLanguageAndFramework(projectDir);
    }

    public static void DetectLanguageAndFramework(String projectDir) {
        File dir = new File(projectDir);

        if (!dir.isDirectory()) {
            System.out.println("Invalid directory: " + projectDir);
            return;
        }

        boolean isMaven = Files.exists(Paths.get(projectDir, "pom.xml"));
        boolean isGradle = Files.exists(Paths.get(projectDir, "build.gradle"));
        boolean hasJavaFiles = hasFilesWithExtension(dir, ".java");

        if (isMaven) {
            System.out.println("Framework: Maven");
        } else if (isGradle) {
            System.out.println("Framework: Gradle");
        } else {
            System.out.println("Framework: Unknown");
        }

        if (hasJavaFiles) {
            System.out.println("Language: Java");
        } else {
            System.out.println("Language: Unknown");
        }
    }

    private static boolean hasFilesWithExtension(File dir, String extension) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    if (hasFilesWithExtension(file, extension)) {
                        return true;
                    }
                } else if (file.getName().endsWith(extension)) {
                    return true;
                }
            }
        }
        return false;
    }
}

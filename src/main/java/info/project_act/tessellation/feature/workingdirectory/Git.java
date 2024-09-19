package info.project_act.tessellation.feature.workingdirectory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Git {
    public static void analyzeGit(String projectDir) {
        File gitDir = new File(projectDir, ".git");
        if (gitDir.exists() && gitDir.isDirectory()) {
            System.out.println("Git repository found at: " + gitDir.getAbsolutePath());

            File configFile = new File(gitDir, "config");
            if (configFile.exists()) {
                parseGitConfig(configFile);
            } else {
                System.out.println("No Git config file found.");
            }
        } else {
            System.out.println("No Git repository found in the specified directory.");
        }
    }

    private static void parseGitConfig(File configFile) {
        try (FileInputStream fis = new FileInputStream(configFile)) {
            Properties properties = new Properties();
            properties.load(fis);

            // Parse remotes
            properties.stringPropertyNames().stream().filter(name -> name.startsWith("remote")).forEach(name -> {
                String url = properties.getProperty(name);
                System.out.println("Remote: " + name + " -> " + url);
            });
        } catch (IOException e) {
            System.err.println("Error reading Git config file: " + e.getMessage());
        }
    }
}

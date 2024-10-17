# Default
# mvn exec:java

# Convert
& "C:\Program Files\OpenJDK\jdk-22.0.2\bin\java.exe" -jar "target\be-local-graph-java-04-0.0.2-jar-with-dependencies.jar" convert -n "C:\Users\nateb\Source\Repos\be-local-graph-java-04\src\main\resources\doap.n3"

# case "local":
# AnalyzeWorkingDirectory(new String[] { projectDir, language });
# break;
# case "github":
# GetGithubProject(new String[] { projectDir });
# break;
# case "convert":
# ConvertDoapN3ToRdf(new String[] { n3FilePath, "doapn3.rdf" });
# break;

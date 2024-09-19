import org.junit.jupiter.api.Test;

import static info.project_act.tessellation.feature.example.LocalFileExample.WriteExampleRDF;
import static info.project_act.tessellation.utilities.RdfUtilities.ConvertDoapN3ToRdf;
import static info.project_act.tessellation.utilities.RdfUtilities.MergeTwoRdf;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Demonstrate reading and writing RDF data using Jena.
 */
public class TestDoap {
    String file1Path = "src/main/resources/doap.rdf";
    String file2Path = "src/main/resources/file_a2.rdf";
    String mergedFilePath = "src/main/resources/merged_a1.rdf";

    String file3Path = "src/main/resources/doap5.rdf";
    String file4Path = "src/main/resources/doap.n3";

    @Test
    public void testMergingDifferentFiles() {
        WriteExampleRDF(new String[]{file2Path});
        MergeTwoRdf(new String[]{file1Path, file2Path, mergedFilePath});
//        assertTrue(Utilities.compareRDFFiles(file2Path, file1Path), "The generated file should be the same as the original.");
//        assertTrue(Utilities.compareRDFFiles(mergedFilePath, file1Path), "Merged file should be the same as the generated file.");
        Utilities.deleteFile(file2Path);
        Utilities.deleteFile(mergedFilePath);
    }

    @Test
    public void testMergingTheSameFiles() {
        WriteExampleRDF(new String[]{file2Path});
        MergeTwoRdf(new String[]{file1Path, file2Path, mergedFilePath});
        // TODO: Currently failing.
//         assertTrue(Utilities.compareRDFFiles(file2Path, file1Path), "The generated file should be the same as the original.");

        // TODO: Currently failing.
        // Test that the merged file is the same as the original.
//         assertTrue(Utilities.compareRDFFiles(mergedFilePath, file1Path), "Merged file should be the same as the generated file.");

        // BUG: Assert doesn't run cleanup code of failure.
        Utilities.deleteFile(file2Path);
        Utilities.deleteFile(mergedFilePath);
    }

    @Test
    public void testCreateRdfFromN3() {
        ConvertDoapN3ToRdf(new String[]{file4Path, file3Path});
        assertTrue(Utilities.compareRDFFiles(file1Path, file3Path), "The generated file should be the same as the original.");
        Utilities.deleteFile(file3Path);
    }
}

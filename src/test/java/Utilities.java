import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.RDFDataMgr;

import java.io.File;
import java.io.InputStream;

public class Utilities {
    public static boolean compareRDFFiles(String file1Path, String file2Path) {
        Model model1 = ModelFactory.createDefaultModel();
        Model model2 = ModelFactory.createDefaultModel();

        try (InputStream in1 = RDFDataMgr.open(file1Path);
             InputStream in2 = RDFDataMgr.open(file2Path)) {
            model1.read(in1, null);
            model2.read(in2, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return model1.isIsomorphicWith(model2);
    }

    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Failed to delete the file");
            }
        }
    }
}

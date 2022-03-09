package part8.unit2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {
    public String textFile = "src/property/part8unit2record.txt";

    public void writeFile(String information, String pathFile) {
        File file = new File(pathFile);
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            writer.write(information);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

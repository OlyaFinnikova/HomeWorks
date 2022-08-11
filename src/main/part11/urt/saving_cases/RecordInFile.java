package part11.urt.saving_cases;

import part11.urt.task.Case;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class RecordInFile {

    private String pathFile;

    public RecordInFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public void writeFile(Map<String, Case> listCase) {

        try (FileWriter writer = new FileWriter(pathFile, false)) {
            for (Map.Entry<String, Case> entry : listCase.entrySet()) {
                writer.write(entry.getValue().toString() + "\n");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String getPath() {
        return pathFile;
    }

    public void setPath(String path) {
        this.pathFile = path;
    }
}

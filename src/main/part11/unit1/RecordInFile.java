package part11.unit1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class RecordInFile {

    private static String pathFile = "src/property/part.txt";

    public String getPath() {
        return pathFile;
    }

    public void setPath(String path) {
        this.pathFile = path;
    }

    public void writeFile(List<Case> listCase) {
        File file = new File(pathFile);
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);

            for (Case userCase : listCase){
                writer.write(userCase.toString() +", Статус Выполнения=" +userCase.isStatusCompletionCase()+"\n");
            }
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


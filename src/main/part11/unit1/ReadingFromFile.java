package part11.unit1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {

    private static String path = "src/property/part.txt";

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String readFile() {

        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(this.path))) {
            String line;
            while ((line = in.readLine()) != null) {
                stringBuilder.append(line).append(" ");
                stringBuilder.append("\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        return stringBuilder.toString();
    }
}

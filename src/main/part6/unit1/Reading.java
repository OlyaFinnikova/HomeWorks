package part6.unit1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * Чтение файла
 */
public class Reading {
    /**
     *  Путь до файла
     */
    public String path = "src/property/part6u1read.txt";

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return Строки файла с количеством символов в них
     */
    public StringBuilder readFile(String path) {
        //  BufferedReader in=null;
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(this.path))) {
            String line;
            while ((line = in.readLine()) != null) {
                stringBuilder.append(line).append(" ");
                stringBuilder.append(line.length());
                stringBuilder.append("\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
            return stringBuilder;
    }
}

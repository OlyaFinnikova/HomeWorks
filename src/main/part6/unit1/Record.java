package part6.unit1;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 * Запись в файл
 */
public class Record {
    /**
     * @param file строки файла с посчитынными символами в них
     */
    public void writeFile(StringBuilder file,String path) {
        try (Writer out = new FileWriter(path)) {
            out.write(String.valueOf(file));
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}

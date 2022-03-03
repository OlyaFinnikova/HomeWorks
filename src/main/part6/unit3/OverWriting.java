package part6.unit3;

import java.io.*;
/**
 * Меняет кодировку файла
 */
public class OverWriting {

    private UserValue value = new UserValue();

    public String path = "src/property/part6u1read.txt";

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    /**
     * Перезаписывает файл с другой кодировкой
     *
     * @param encoding старая кодировка файла
     */
    public void start(String encoding,String path) {
        String newEncoding = getNewEncodingFile(encoding);
        write(read(encoding,path),newEncoding,path);
    }
    /**
     * Меняет кодировку файла
     *
     * @param userCharsetRead старая кодировка файла
     * @return новая кодировка файла
     */
    private String getNewEncodingFile(String userCharsetRead) {
        if (userCharsetRead.equals(value.actions[0])) {
            return value.actions[1];
        } else {
            return value.actions[0];
        }
    }
    /**
     * Чтение данных с файла
     *
     * @param encoding старая кодировка файла
     * @return данные файла
     */
    public StringBuilder read(String encoding,String path) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(path), encoding))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
        return stringBuilder;
    }
    /**
     * Записывает преобразованные данные в файл
     *
     * @param file данные файла
     * @param newEncoding новая кодировка файла
     */
    public void write(StringBuilder file, String newEncoding,String path) {
        try (Writer out = new OutputStreamWriter(new FileOutputStream(path), newEncoding)) {
            out.write(String.valueOf(file));
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}

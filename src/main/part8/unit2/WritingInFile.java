package part8.unit2;

import java.io.*;

public class WritingInFile implements Writing{
    @Override
    public void write(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        try {

            BufferedReader reader = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line=reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
        stringBuilder.append(text);

        try (Writer out = new FileWriter(pathFile)) {
            out.write(String.valueOf(stringBuilder));
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        }
    }
}

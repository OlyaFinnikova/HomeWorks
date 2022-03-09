package part8.unit2;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingInFile {

    private String textFile = readFile("src/property/part8unit2.txt");

    public int getParameterTraceOrRecord(LevelTrace[] expectedInformation) {
        return readValueUser(expectedInformation, textFile);
    }

    private String readFile(String pathFile) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
        return stringBuilder.toString().toLowerCase();
    }

    private int readValueUser(LevelTrace[] expectedInformation, String actualInformation) {

        for (int i = 0; i < expectedInformation.length; i++) {
            int result = actualInformation.indexOf(expectedInformation[i].getName());
            if (result >= 0) {
                return ++i;
            }
        }
        return 0;
    }
}

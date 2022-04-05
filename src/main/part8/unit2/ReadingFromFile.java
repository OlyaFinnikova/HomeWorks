package part8.unit2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;

public class ReadingFromFile implements Reading {

    @Override
    public Map<String, String> read() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line=reader.readLine()) != null) {
                String[] params = line.toLowerCase().split("=");
                map.put(params[0], params[1]);
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
        return map;
    }
}

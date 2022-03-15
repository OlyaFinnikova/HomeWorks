package part8.unit2;

import java.util.HashMap;
import java.util.Map;

public interface Reading {

    public Map<String, String> map = new HashMap<>();

    public String pathFile = "src/property/part8unit2.txt";
    public Map<String, String> read();
}

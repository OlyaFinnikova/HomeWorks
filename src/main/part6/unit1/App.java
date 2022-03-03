package part6.unit1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class App {
    public static void main(String[] args) {
       Reading reading= new Reading();
        new Record().writeFile(reading.readFile(reading.path),reading.path);
    }
}

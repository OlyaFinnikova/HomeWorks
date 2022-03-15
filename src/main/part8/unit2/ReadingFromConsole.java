package part8.unit2;

import java.util.Map;
import java.util.Scanner;

public class ReadingFromConsole implements Reading {

    @Override
    public Map<String, String> read() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уровень трассировки:error,debug или all.");
        map.put("level", scanner.nextLine().toLowerCase());
        System.out.println("Введите куда производить запись:console или file.");
        map.put("place", scanner.nextLine().toLowerCase());
        return map;
    }
}

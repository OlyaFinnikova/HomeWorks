package part10.unit1;

import java.util.Scanner;

public class UserValue {

    public String getUserCommands() {
        System.out.println("Введите команду");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();

    }
}

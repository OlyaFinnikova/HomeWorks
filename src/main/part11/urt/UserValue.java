package part11.urt;

import java.util.Scanner;

public class UserValue {

    public String getUserItemMenu() {
        System.out.println("Введите пункт меню!");
        return scan();
    }

    public String getUserName() {
        System.out.println("Введите имя");
        return scan();
    }

    public String getUserDescription() {
        System.out.println("Введите описание");
        return scan();
    }

    public String getImportanceCase() {
        System.out.println("Введите важность дела критично,средне или неважно.");
        String value = scan().toLowerCase();
        while (!(value.equals("неважно") || value.equals("средне") || value.equals("критично"))) {
            System.out.println("Параметр введен неккоректно, повторите ввод");
            value = scan().toLowerCase();
        }
        return value;
    }

    private String scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

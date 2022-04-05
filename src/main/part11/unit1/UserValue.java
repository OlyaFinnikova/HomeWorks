package part11.unit1;

import java.util.Scanner;

public class UserValue {


    public String getUserItemMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пункт меню!");
        String userItem = scanner.nextLine();
        while (!(userItem.equals("1") || userItem.equals("2") || userItem.equals("3")
                || userItem.equals("4") || userItem.equals("5") || userItem.equals("6"))) {
            System.out.println("Такого пунта нет, повторите ввод");
            userItem = scanner.nextLine();
        }
        return userItem;
    }

    public String getUserName() {
        System.out.println("Введите имя");
       return scan();
    }
    public String getUserDescription() {
        System.out.println("Введите описание");
        return scan();
    }

    public Importance getImportanceCase() {
        System.out.println("Введите важность дела критично,средне или неважно.");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine().toLowerCase();
        while (!(value.equals("важно") || value.equals("средне") || value.equals("критично"))){
            System.out.println("Такой важности нет, повторите ввод");
            value = scanner.nextLine().toLowerCase();
        }
        if (value.contains("критично")) {
            return Importance.CRITICAL;
        } else if (value.contains("средне")) {
            return Importance.MEDIUM;
        } else {
            return Importance.UNIMPORTANT;
        }
    }

    private String scan(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

package part6.unit3;

import java.util.Scanner;

public class UserValue {

    public String[] actions = {"UTF-8", "windows-1251"};
    /**
     * @return изначальная шифровка файла
     */
    public String getEncodingFile() {
        System.out.println("Введите кодировку файла на данный момент UTF-8 или windows-1251.");
        System.out.println("После этого программа переведёт файл в другую кодировку.");
        Scanner scanner = new Scanner(System.in);
        String userAction = scanner.next();
        while (!(actions[0].equals(userAction) || actions[1].equals(userAction))) {
            System.out.println("Повторите ввод");
            userAction = scanner.next();
        }
        return userAction;
    }
}

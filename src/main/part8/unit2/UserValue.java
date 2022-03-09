package part8.unit2;

import java.util.Scanner;

public class UserValue {
    /**
     * @return место для считывания/записи информации
     */
    public int getUserPlace() {
        System.out.println("Чтобы выбрать ведите 1 или 2,где первое консоль,второе файл");
        Scanner scanner = new Scanner(System.in);
        int userTrace = scanner.nextInt();
        while (!(1 != userTrace || 2 != userTrace)){
            System.out.println("Повторите ввод");
            userTrace = scanner.nextInt();
        }
        return userTrace;
    }

    public int getUserTrace() {
        Scanner scanner = new Scanner(System.in);
        int userAction = scanner.nextInt();
        while (!(0 > userAction || 3 < userAction)) {
            System.out.println("Повторите ввод");
            userAction = scanner.nextInt();
        }
        return userAction;
    }

    /**
     * @return путь до файла
     */
    public String getUserPath() {
        System.out.println("Введите путь до документа");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }

}

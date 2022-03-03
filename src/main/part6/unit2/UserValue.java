package part6.unit2;

import java.util.Scanner;
/**
 * Получение данных пользователя
 */
public class UserValue {

    public String[] actions = {"шифровать", "расшифровать"};
    /**
     * @return параметр шифрования(шифровать или расшифровывать)
     */
    public String getUserAction() {
        System.out.println("Введите шифровать или расшифровать");
        Scanner scanner = new Scanner(System.in);
        String userAction = scanner.next().toLowerCase();
            while (!(actions[0].equals(userAction) || actions[1].equals(userAction))) {
                System.out.println("Повторите ввод");
                userAction = scanner.next().toLowerCase();
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
    /**
     * @return шаг расшифровки
     */
    public int getUserShift() {
        System.out.println("Введите шаг для расшифровки или шифровки");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

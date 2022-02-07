package part4.unit3;
import java.util.Scanner;
/**
 *Считывает значение пользователя
 */
public class GetUserValue {

    GameMenu menu = new GameMenu();

    public String getUserValueString() {

        System.out.println("Выберите пункт меню : начать новую игру, продолжить, настройки.Для выбора напечатайте нужный пункт. Для выхода напечатайте выйти.");
        Scanner scanner = new Scanner(System.in);
        String userValue = scanner.nextLine().toUpperCase();
        while (!(userValue.equals(menu.exit) || userValue.equals(menu.continueGame) || userValue.equals(menu.newGame) || userValue.equals(menu.setting))) {
            System.out.println("Такого обозначения нет,повторите ввод.");
            userValue = scanner.nextLine().toUpperCase();
        }
        return userValue;
    }
}

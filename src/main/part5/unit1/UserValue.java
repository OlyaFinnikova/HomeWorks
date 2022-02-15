package part5.unit1;

import java.util.Scanner;
/**
 * Получение значений пользователя
 */
public class UserValue {
   protected String division="/";
   protected String addition="+";
   protected String subtraction = "-";
   protected String multiplication = "*";
    /**
     * @return значения для операндов
     */
    public int getUserValueOperand() {
        System.out.println("Введите число.");
        Scanner scanner = new Scanner(System.in);
        int userValue = scanner.nextInt();
        return userValue;
    }
    /**
     * @return арифметическое действие умножение,деление,сложение или вычитание
     */
    public String getUserArithmeticAction() {
        System.out.println("Выберите арифметическое действе: +,-,/ или *.");
        Scanner scanner = new Scanner(System.in);
        String userValue = scanner.next();
        while (!(userValue.equals(division) || userValue.equals(addition) || userValue.equals(subtraction) || userValue.equals(multiplication))) {
            System.out.println("Такого действия нет, повторите ввод.");
            userValue = scanner.next();
        }
        return userValue;
    }
}

package part5.unit3;

import java.util.Scanner;
/**
 * Получение значений пользователя
 */
public class UserValue {
    /**
     * @return строку из нулей и единиц
     */
    public String[] getUserValue() {
        Scanner scanner = new Scanner(System.in);
        String userValue = scanner.nextLine();
        String[] values = userValue.split("");

        while (!checkValue(values)) {
            System.out.println("Вы ввели что-то кроме нулей и единиц, повторите ввод.");
            userValue = scanner.nextLine();
            values = userValue.split("");
        }
        return values;
    }
    /**
     * @return ввел ли пользователь только единицы и нули
     */
    private boolean checkValue(String[] array) {
        for (String s : array) {
            if (!("0".equals(s) || "1".equals(s))) {
                return false;
            }
        }
        return true;
    }
}


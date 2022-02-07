package part3.unit3;

import java.util.Scanner;

/**
 * Класс получает значение пользователя
 */

public class Player {

    /**
     * Проверяет введённые значения
     *
     * @return Значение пользователя
     */
    public String getUserValue() {
        System.out.println("Это игра камень,ножницы,бумага.Чтобы сделать ход введи одно из значений:");
        Scanner scanner = new Scanner(System.in);
        String userValue = scanner.nextLine().toLowerCase();
        while (!("ножницы".equals(userValue) || "камень".equals(userValue) || "бумага".equals(userValue))) {
            System.out.println("Такого значения нет,повторите ввод");
            userValue = scanner.nextLine().toLowerCase();
        }
        return userValue;
    }
}

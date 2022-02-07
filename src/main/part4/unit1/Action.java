package part4.unit1;

import java.util.Scanner;

/**
 * Класс обрабатывает данные пользователя перед вычислением
 */

public class Action {

    private String f = "F";
    private String c = "C";

    public void start() {
        defineDesiredClass(getUserValueString());
    }
    /**
     * Считывает значения пользователя
     * @return значение пользователя в виде массива
     */
    private String[] getUserValueString() {

        System.out.println("Это конвертер, он переводит градусы по Фаренгейту в Цельсии и наоборот.");
        System.out.println("Чтобы воспользоваться введите значение,а затем через пробел буквенное обозначение F или С, например, 15 F,");
        System.out.println("где F-Фаренгейт, а С-Цельсий. Дробные значения вводятся через точку 12.5 С");
        Scanner scanner = new Scanner(System.in);
        String userValue = scanner.nextLine().toUpperCase();
        String[] values = userValue.split(" ");

        while (!(values[1].equals(f) || values[1].equals(c))) {
            System.out.println("Такого обозначения нет,вы забыли F или С");
            userValue = scanner.nextLine().toUpperCase();
            values = userValue.split(" ");
        }
        return values;
    }
    /**
     *Определяет в градусы по Цельсию или Фаренгейту нужно перевести
     */
    private void defineDesiredClass(String[] userValues) {
        String userText = userValues[0];
        double userValueDouble = Double.parseDouble(userText);
        if (userValues[1].equals(f)) {
            new ConverterC().calculator(userValueDouble);
        }
        if (userValues[1].equals(c)) {
            new ConverterF().calculator(userValueDouble);
        }
    }
}

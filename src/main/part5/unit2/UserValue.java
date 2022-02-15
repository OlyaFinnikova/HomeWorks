package part5.unit2;

import java.util.Scanner;
/**
 * Получение значения пользователя
 */
public class UserValue {
    public String tea = "чай";
    public String teaMilk = "чай с молоком";
    public String teaMilkCinnamon="чай с молоком и корицей";
    public String coffee = "кофе";
    public String coffeeMilk = "кофе с молоком";
    public String coffeeMilkCinnamon="кофе с молоком и корицей";
    /**
     * @return значение пользователя из списка
     */
    public String getUserValue() {
        System.out.println("Выберите какой напиток вы хотите: кофе, чай, кофе/чай с молоком, кофе/чай с молоком и корицей.");
        Scanner scanner = new Scanner(System.in);
        String userValue = scanner.nextLine().toLowerCase();
        while (!(userValue.equals(tea) || userValue.equals(teaMilk) || userValue.equals(teaMilkCinnamon) ||
                userValue.equals(coffee) || userValue.equals(coffeeMilk) || userValue.equals(coffeeMilkCinnamon))) {
            System.out.println("Такого напитка нет в меню,повторите ввод.");
            userValue = scanner.nextLine().toLowerCase();
        }
        return userValue;
    }
}
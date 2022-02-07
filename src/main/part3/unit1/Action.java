package part3.unit1;

import java.util.Scanner;
/**
 * Класс создаёт мебель
 */
public class Action {

    /**
     * Создаёт мебель
     */

    public void getUserValue() {
        Furniture furniture = new Furniture();
        addName(furniture);
        addColor(furniture);
        addType(furniture);
        System.out.println(furniture.toString());
    }
    /**
     * Получает название мебели
     */

    private void addName(Furniture furniture) {
        System.out.println("Введите название мебели лофт,лондон или монро.");
        do {
            switch (scan()) {
                case ("лофт"):
                    furniture.setName(NameFurniture.LOFT);
                    break;
                case ("лондон"):
                    furniture.setName(NameFurniture.LONDON);
                    break;
                case ("монро"):
                    furniture.setName(NameFurniture.MONRO);
                    break;
                default:
                    System.out.println("Такого значения нет,повторите ввод");
            }
        } while (furniture.getName() == null);
    }

    /**
     * Считывает значения пользователя
     */
    private String scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }
    /**
     * Получает название цвета
     */

    private void addColor(Furniture furniture) {
        System.out.println("Введите цвет мебели красный,голубой или зелёный.");
        do {
            switch (scan()) {
                case ("красный"):
                    furniture.setColor(ColorFurniture.RED);
                    break;
                case ("голубой"):
                    furniture.setColor(ColorFurniture.BLUE);
                    break;
                case ("зелёный"):
                    furniture.setColor(ColorFurniture.GREEN);
                    break;
                default:
                    System.out.println("Такого значения нет,повторите ввод");
            }
        } while (furniture.getColor() == null);
    }
    /**
     * Получает тип мебели
     */
    private void addType(Furniture furniture) {
        System.out.println("Введите тип мебели кровать,шкаф,стол или стул.");
        do {
            switch (scan()) {
                case ("кровать"):
                    furniture.setType(TypeFurniture.BED);
                    break;
                case ("шкаф"):
                    furniture.setType(TypeFurniture.WARDROBE);
                    break;
                case ("стол"):
                    furniture.setType(TypeFurniture.TABLE);
                    break;
                case ("стул"):
                    furniture.setType(TypeFurniture.CHAIR);
                    break;
                default:
                    System.out.println("Такого значения нет,повторите ввод");
            }
        } while (furniture.getType() == null);
    }
}

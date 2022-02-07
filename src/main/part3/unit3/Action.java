package part3.unit3;

import java.util.Scanner;

/**
 * Игра камень ножницы бумага
 */
public class Action {
    /**
     * Запускает игру
     */
    public void startGame() {
        Player player = new Player();
        checkWin(player.getUserValue(), getComputerValue());

    }

    /**
     * Сравнивает значения
     * Определяет победителя
     */

    public void checkWin(String userValue, String computerValue) {
        String lose = "Ты проиграл";
        String win = "Ты выиграл";
        System.out.println("Компьютер выбрал " + computerValue);
        if (userValue.equals(computerValue)) {
            System.out.println("Ничья");
        } else {
            if ("ножницы".equals(userValue) && "камень".equals(computerValue) ||
                    "камень".equals(userValue) && "бумага".equals(computerValue) ||
                    "бумага".equals(userValue) && "ножницы".equals(computerValue)) {
                System.out.println(lose);
            } else {
                System.out.println(win);
            }
        }
    }

    /**
     * @return Значение компьютера
     */

    private String getComputerValue() {
        String[] values = new String[]{"камень", "ножницы", "бумага"};
        return values[(int) (Math.random() * values.length)];
    }
}

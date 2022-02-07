package part4.unit2;

import java.util.Scanner;
/**
 * Класс обрабатывает данные пользователя перед вычислением
 */
public class Action {

    Worker worker = new Worker();
    /**
     * Считывает значения пользователя
     * @return userValue значение пользователя
     */
    public String getUserValueString() {

        System.out.println("Введите кем вы работаете обычный рабочий,помощник директора или директор.");
        Scanner scanner = new Scanner(System.in);
        String userValue = scanner.next().toLowerCase();
        while (!(userValue.equals(worker.ordinaryWorker) || userValue.equals(worker.assistantDirector) || userValue.equals(worker.director))) {
            System.out.println("Такого обозначения нет,повторите ввод.");
            userValue = scanner.next().toLowerCase();
        }
        return userValue;
    }
    /**
     *Определяет кому рассчитывается премия
     */
    public void calculationPremium(String userValue) {
        if (userValue.equals(worker.ordinaryWorker)) {
            Worker ordinaryWorker1 = new OrdinaryWorker();
            ordinaryWorker1.calculation();
        }
        if (userValue.equals(worker.assistantDirector)) {
            Worker assistantDirector1 = new AssistantDirector();
            assistantDirector1.calculation();
        }
        if (userValue.equals(worker.director)) {
            Worker director1 = new Director();
            director1.calculation();
        }
    }
}

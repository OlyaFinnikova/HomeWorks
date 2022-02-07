package part4.unit3;
/**
 * Класс задаёт остновные параметры для всех пунктов в меню
 */
public class GameMenu {
    protected String exit = "ВЫЙТИ";
    protected String newGame = "НАЧАТЬ НОВУЮ ИГРУ";
    protected String continueGame = "ПРОДОЛЖИТЬ";
    protected String setting = "НАСТРОЙКИ";
    public void output(){
        System.out.println("Вы выбрали пункт ");
    }

}

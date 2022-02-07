package part4.unit3;
/**
 * Класс отправляет в пункт новая игра
 */
public class NewGame extends GameMenu {
    @Override
    public void output() {
        super.output();
        System.out.print(newGame);
    }
}

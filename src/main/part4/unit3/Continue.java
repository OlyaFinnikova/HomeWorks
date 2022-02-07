package part4.unit3;
/**
 * Класс отправляет в пункт продлжение игры
 */
public class Continue extends GameMenu{
    @Override
    public void output() {
        super.output();
        System.out.println(continueGame);
    }
}

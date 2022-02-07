package part4.unit3;
/**
 * Класс отправляет в пункт выход
 */
public class Exit extends GameMenu {

    @Override
    public void output() {
        super.output();
        System.out.print(exit);
    }
}

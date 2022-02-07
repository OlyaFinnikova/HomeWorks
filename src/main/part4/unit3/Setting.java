package part4.unit3;
/**
 * Класс отправляет в пункт настройки
 */
public class Setting extends GameMenu{
    @Override
    public void output() {
        super.output();
        System.out.println(setting);
    }
}

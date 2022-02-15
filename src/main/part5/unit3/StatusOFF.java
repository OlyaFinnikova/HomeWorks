package part5.unit3;
/**
 *Статус "не работает"
 */
public class StatusOFF implements IStatus {

    @Override
    public String work() {
        return "Не работает";
    }
}

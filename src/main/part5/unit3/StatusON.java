package part5.unit3;
/**
 *Статус "работает"
 */
public class StatusON implements IStatus {
    @Override
    public String work() {
        return "Работает";
    }
}

package part5.unit3;
/**
 *Выводит статус работы
 */
public class Program {

    private IStatus status;
    private ConditionWork conditionWork = new ConditionWork();
    private UserValue userValue = new UserValue();

    public String start(){
        String[] values = userValue.getUserValue();
        determineStatus(values);
        return work();
    }

    public void setStatus(IStatus status) {
        this.status = status;
    }
    /**
     *Присваивает нужный статус
     */
    public void determineStatus(String[] userValues) {
        if (conditionWork.checkCondition(userValues)) {
            setStatus(new StatusON());
        } else {
            setStatus(new StatusOFF());
        }
    }
    /**
     *@return статус работы
     */
    public String work() {
        return status.work();
    }
}

package part5.unit3;
/**
 *Статус "не работает"
 */
public class StatusOFF implements IStatus {
    @Override
    public int doSomething(Program program, String[] userValue) {
        ConditionWork conditionWork = new ConditionWork();

        if (!conditionWork.checkCondition(userValue)) {
            System.out.println("Не работаю");
        } else {
            System.out.println("Работаю");
            program.setStatus(new StatusON());
        }
        return 0;
    }
}

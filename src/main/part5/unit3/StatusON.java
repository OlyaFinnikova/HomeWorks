package part5.unit3;

import part1.S;

/**
 *Статус "работает"
 */
public class StatusON implements IStatus {
    @Override
    public int doSomething(Program program,String[] userValue) {
        ConditionWork conditionWork = new ConditionWork();

        if (conditionWork.checkCondition(userValue)) {
            System.out.println("Работаю");
        }else {
            System.out.println("Не работаю");
         program.setStatus(new StatusOFF());
        }
        return 1;
    }
}

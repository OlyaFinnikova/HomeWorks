package part5.unit3;
/**
 * Условие работы
 */
public class ConditionWork {
    /**
     *@return условие работы или не работы
     */
    public boolean checkCondition(String[] array){
        if (checkZero(array) && checkOne(array)){
            return true;
        }
        return false;
    }
    /**
     *@return правда ли,что нулей нечётное количество
     */
    private boolean checkZero(String[] array) {
        int counterZero = 0;
        for (String s : array) {
            if ("0".equals(s)) {
                counterZero++;
            }
        }
        if (counterZero % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    /**
     *@return правда ли,что единиц чётное количество
     */
    private boolean checkOne(String[] array) {
        int counterOne = 0;
        for (String s : array) {
            if ("1".equals(s)) {
                counterOne++;
            }
        }
        if (counterOne % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
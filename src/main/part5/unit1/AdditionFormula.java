package part5.unit1;
/**
 * Сложение
 */
public class AdditionFormula implements CalculationFormulas{
    /**
     * @param a левый операнд
     * @param b правый операнд
     * @return результат сложения первого операнда и второго
     */
    @Override
    public int calculate(int a,int b) {
        return a+b;
    }
}

package part5.unit1;
/**
 * Умножение
 */
public class MultiplicationFormula implements CalculationFormulas {
    /**
     * @param a левый операнд
     * @param b правый операнд
     * @return результат умножения первого операнда на второй
     */
    @Override
    public int calculate(int a, int b) {
        return a*b;
    }
}

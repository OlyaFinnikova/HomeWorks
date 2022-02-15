package part5.unit1;
/**
 * Вычитание
 */
public class SubtractionFormula implements CalculationFormulas{
    /**
     *
     * @param a левый операнд
     * @param b правый операнд
     * @return результат вычитание второго операнда из первого
     */
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}

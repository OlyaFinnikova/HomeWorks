package part5.unit1;
/**
 * Деление
 */
public class DivisionFormula implements CalculationFormulas{
    /**
     * Если второй операнд равен 0, то метод возвращает 0
     *
     * @param a левый операнд
     * @param b правый операнд
     * @return результат деления первого операнда на второй
     */
    @Override
    public int calculate(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a/b;
    }
}

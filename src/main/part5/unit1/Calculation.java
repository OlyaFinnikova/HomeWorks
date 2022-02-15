package part5.unit1;

/**
 * Калькулятор
 */
public class Calculation {

    public UserValue user = new UserValue();
    public int start() {
        return chooseArithmeticAction(user.getUserValueOperand(), user.getUserArithmeticAction(), user.getUserValueOperand());
    }
    /**
     * Производит расчёт
     *
     * @param a левый операнд
     * @param b правый операнд
     * @param userArithmeticAction арифметическое действие
     * @return результат расчётов,учитывая выбранное арифметическое действие
     */
    public int chooseArithmeticAction(int a, String userArithmeticAction, int b) {

        if (userArithmeticAction.equals(user.multiplication)) {
            return new MultiplicationFormula().calculate(a, b);

        } else if (userArithmeticAction.equals(user.addition)) {
            return new AdditionFormula().calculate(a, b);

        } else if (userArithmeticAction.equals(user.division)) {
            return new DivisionFormula().calculate(a, b);

        } else {
            return new SubtractionFormula().calculate(a, b);
        }
    }
}

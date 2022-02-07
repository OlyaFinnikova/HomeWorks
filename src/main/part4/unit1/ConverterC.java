package part4.unit1;
/**
 * Конвертер из градусов по Фаренгейту в Цельсии
 */
public class ConverterC extends ConverterF {
    /**
     * Переводит градусы по Фаренгейту в Цельсии
     */
    @Override
    public double calculator(double userValue) {
        double result =5*(userValue-32)/9;
        System.out.println("Ваше значение равняется " + result + "C");
        return result;
    }
}

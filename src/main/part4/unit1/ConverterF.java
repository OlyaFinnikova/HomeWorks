package part4.unit1;

/**
 * Конвертер из градусов по Цельсию в Фаренгейт
 */
public class ConverterF {
    /**
     * Переводит градусы по Цельсию в Фаренгейт
     */
    public double calculator(double userValue){
        double result = userValue*9/5+32;
        System.out.println("Ваше значение равняется " + result + "F");
        return result;
    }
}

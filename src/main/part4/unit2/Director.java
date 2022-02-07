package part4.unit2;
/**
 * Класс задаёт параметры для директора
 */
public class Director extends Worker {
    /**
     * Расчёт премии директора
     */
    @Override
    public int calculation() {
      result = premium * 50/100;
        System.out.println("Я  директор, и я получу премию в размере " + result);
        return result;
    }
}

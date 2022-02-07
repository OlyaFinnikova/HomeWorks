package part4.unit2;
/**
 * Класс задаёт параметры для обычного работника
 */
public class OrdinaryWorker extends Worker {
    /**
     * Расчёт премии обычного работника
     */
    @Override
    public int calculation() {
        result = premium * 10/100;
        System.out.println("Я обычный работник, и я получу премию в размере " + result);
return result;
    }
}

package part4.unit2;
/**
 * Класс задаёт остновные параметры
 */
public class Worker {

    public int premium = 1000000;
    private int percent;
    public String ordinaryWorker = "обычный рабочий";
    public String assistantDirector = "помощник директора";
    public String director = "директор";
    public int result;
    /**
     * Расчёт премии
     */
    public int calculation() {
        result = premium * percent;
        return result;
    }
}

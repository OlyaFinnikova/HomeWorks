package part4.unit2;
/**
 * Класс задаёт параметры для помощника директора
 */
public class AssistantDirector extends Worker {
    /**
     * Расчёт премии пмощника директора
     */
    @Override
    public int calculation() {
        result = premium * 20/100;
        System.out.println("Я помощник директора, и я получу премию в размере " + result);
        return result;
    }
}

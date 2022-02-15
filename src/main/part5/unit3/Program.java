package part5.unit3;

/**
 * Выводит статус работы
 */
public class Program {

    private IStatus status;
    private UserValue userValue = new UserValue();
    public void setStatus(IStatus status) {
        this.status = status;
    }
    /**
     * Выполняет действие в завсимости от статуса
     */
    public void doSomething() {
       status.doSomething(this, userValue.getUserValue());
    }
}


package part3.unit2;
/**
 * Описывает клетки
 */
public class Cell {

    private boolean liveStatus;

    public Cell() {
    }
    /**
     * @param liveStatus Статус жизни
     */
    public Cell(boolean liveStatus) {
        this.liveStatus = liveStatus;
    }
    /**
     * @return Статус жизни
     */
    public boolean isLiveStatus() {
        return liveStatus;
    }
    /**
     * @param liveStatus Статус жизни
     */
    public void setLiveStatus(boolean liveStatus) {
        this.liveStatus = liveStatus;
    }
}


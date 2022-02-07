package part3.unit1;

/**
 * Класс описывает цвет мебели
 */

public enum ColorFurniture {
    RED("Красный"),
    BLUE("Голубой"),
    GREEN("Зелёный");

    private String name;
    /**
     * @param name Имя
     */
    ColorFurniture(String name){
        this.name=name;
    }
    /**
     * @return Имя
     */
    public String getName() {
        return name;
    }
    /**
     * @param name Имя
     */
    public void setName(String name) {
        this.name = name;
    }
}

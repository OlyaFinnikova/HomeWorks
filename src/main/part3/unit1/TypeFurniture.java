package part3.unit1;

public enum TypeFurniture {
    BED("Кровать"),
    WARDROBE("Шкаф"),
    TABLE("Стол"),
    CHAIR("Стул");

    private String name;
    /**
     * @param name Имя
     */
    TypeFurniture(String name) {
        this.name = name;
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

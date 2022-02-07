package part3.unit1;

public enum NameFurniture {

    LOFT("Лофт"),
    LONDON("Лондон"),
    MONRO("Монро");

    private String name;
    /**
     * @param name Имя
     */
    NameFurniture(String name){
        this.name=name;
    }
    /**
     * @return  Имя
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

package part11.unit1;

public enum Importance {

    CRITICAL("критично"),
    MEDIUM("средне"),
    UNIMPORTANT("неважно");

    private String name;

    Importance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

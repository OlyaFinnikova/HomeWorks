package part11.urt.task;

public class Case {

    private String name;
    private String description;
    private Importance importance;
    private boolean statusCompletion;

    public Case() {
    }

    public Case(String name, String description, Importance importance) {
        this.name = name;
        this.description = description;
        this.importance = importance;
        this.statusCompletion = false;
    }

    public Case(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Importance getImportance() {
        return importance;
    }

    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    public boolean isStatusCompletion() {
        return statusCompletion;
    }

    public void setStatusCompletion(boolean statusCompletion) {
        this.statusCompletion = statusCompletion;
    }

    @Override
    public String toString() {
        return "Название=" + name +
                ", описание=" + description +
                ", важность=" + importance.getName() +
                ", статус выполнения=" + getValueStatusCompletion(isStatusCompletion());
    }

    private String getValueStatusCompletion(Boolean status) {
        return status ? "выполнено" : "не выполнено";
    }
}
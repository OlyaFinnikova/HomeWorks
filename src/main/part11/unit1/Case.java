package part11.unit1;

public class Case {

    private String nameCase;
    private String descriptionCase;
    private Importance importanceCase;
    private boolean statusCompletionCase;

    public Case(String nameCase, String descriptionCase, Importance importanceCase, boolean statusCompletionCase) {
        this.nameCase = nameCase;
        this.descriptionCase = descriptionCase;
        this.importanceCase = importanceCase;
        this.statusCompletionCase = statusCompletionCase;
    }

    public String getNameCase() {
        return nameCase;
    }

    public void setNameCase(String nameCase) {
        this.nameCase = nameCase;
    }

    public String getDescriptionCase() {
        return descriptionCase;
    }

    public void setDescriptionCase(String descriptionCase) {
        this.descriptionCase = descriptionCase;
    }

    public Importance getImportanceCase() {
        return importanceCase;
    }

    public void setImportanceCase(Importance importanceCase) {
        this.importanceCase = importanceCase;
    }

    public boolean isStatusCompletionCase() {
        return statusCompletionCase;
    }

    public void setStatusCompletionCase(boolean statusCompletionCase) {
        this.statusCompletionCase = statusCompletionCase;
    }

    @Override
    public String toString() {
        return "Название=" + nameCase +
                ", описание=" + descriptionCase +
                ", важность=" + importanceCase.getName();
    }
}

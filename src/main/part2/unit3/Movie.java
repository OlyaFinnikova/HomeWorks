package part2.unit3;

public class Movie {
    String title;
    int durationSecond;
    String regisseur;

    public Movie() {
    }

    public Movie(String title, int durationSecond, String regisseur) {
        this.title = title;
        this.durationSecond = durationSecond;
        this.regisseur = regisseur;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationSecond() {
        return durationSecond;
    }

    public void setDurationSecond(int durationSecond) {
        this.durationSecond = durationSecond;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }
}

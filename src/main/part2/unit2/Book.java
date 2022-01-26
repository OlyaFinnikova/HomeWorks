package part2.unit2;

public class Book {
    String title;
    int numberOfPages;
    int yearOfRelease;
    String author;


    public Book() {
    }

    public Book(String title, int numberOfPages, int yearOfRelease, String author) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = yearOfRelease;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

import java.io.Serializable;

public class Book implements Serializable {
    // Attribut
    private String title;
    private String author;
    private int ISBN;

    // Standardkonstruktor (ohne Parameter)
    public Book() {
    }

    // Optional: onstruktor mit Parameter
    public Book(String title) {
        this.title = title;
    }

    // Getter-Methode für title
    public String getTitle() {
        return title;
    }

    public String getauthor(String author){
        return author;
    }

    // Setter-Methode für title
    public void setTitle(String title) {
        this.title = title;
    }

    public void setauthor(String author){
        this.author = author;
    }

    // Optional: Überschreiben der toString-Methode für eine bessere Darstellung
    @Override
    public String toString() {
        return "Book{title='" + title + "'}";
    }
}

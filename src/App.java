import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Willkommen in der Bibiliotheksverwaltung!");

        System.out.println("Sie haben folgende Möglichkeiten:");
        System.out.println("1. Buch hinzufügen");
        System.out.println("2. Buch anzeigen");
        System.out.println("3. Buch suchen");
        System.out.println("4. Buch entfernen");

        Scanner sc = new Scanner(System.in);


        int option = sc.nextInt();
        sc.nextLine(); 


        List<Book> books = new ArrayList<Book>();
        Book book1 = new Book();
        book1.setTitle("Der Prozess");
        book1.setAuthor("Franz Kafka");
        book1.setAvailable(true);
        book1.setIsbn("978-3-16-148410-0");
        books.add(book1);

        Book book2 = new Book();
        book2.setTitle("Der Steppenwolf");
        book2.setAuthor("Hermann Hesse");
        book2.setAvailable(false);
        book2.setIsbn("978-3-16-148410-0");
        books.add(book2);

        switch (option) {
            case 1:
                System.out.println("Bitte geben Sie den Titel des Buches ein:");
                String title = sc.nextLine();
                System.out.println("Bitte geben Sie den Autor des Buches ein:");
                String author = sc.nextLine();
                System.out.println("Bitte geben Sie die ISBN des Buches ein:");
                String isbn = sc.nextLine();

                Book book3 = new Book();
                book3.setTitle(title);
                book3.setAuthor(author);
                book3.setIsbn(isbn);
                book3.setAvailable(true);

                books.add(book3);

                System.out.println("Buch erfolgreich hinzugefügt!");

                System.out.println("Aktuelle Liste der Bücher in der Bibliothek:");
                System.out.println("===================================");

                for (Book book : books) {
                    System.out.println("Titel: " + book.getTitle());
                    System.out.println("Autor: " + book.getAuthor());
                    System.out.println("Verfügbar: " + (book.isAvailable() ? "Ja" : "Nein"));
                    System.out.println("ISBN: " + book.getIsbn());
                    System.out.println();
                }

                break;
            case 2:
                System.out.println("Liste der Bücher in der Bibliothek:");
                System.out.println("===================================");

                for (Book book : books) {
                    System.out.println("Titel: " + book.getTitle());
                    System.out.println("Autor: " + book.getAuthor());
                    System.out.println("Verfügbar: " + (book.isAvailable() ? "Ja" : "Nein"));
                    System.out.println("ISBN: " + book.getIsbn());
                    System.out.println();
                }

                break;
            case 3:

                break;
            case 4:

                break;

            default:
                System.out.println("Ungültige Option. Bitte wählen Sie eine Zahl zwischen 1 und 4.");
                break;
        }
  
        sc.close();
    }
}
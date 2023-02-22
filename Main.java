import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Örnek Kitap 1", 10, "Örnek Yazar 1", "1.1.2000");
        Book book2 = new Book("Örnek Kitap 2", 11, "Örnek Yazar 2", "1.2.2000");
        Book book3 = new Book("Örnek Kitap 3", 12, "Örnek Yazar 3", "1.3.2000");
        Book book4 = new Book("Örnek Kitap 4", 13, "Örnek Yazar 4", "1.4.2000");
        Book book5 = new Book("Örnek Kitap 5", 14, "Örnek Yazar 5", "1.5.2000");
        Book book6 = new Book("Örnek Kitap 6", 105, "Örnek Yazar 6", "1.6.2000");
        Book book7 = new Book("Örnek Kitap 7", 106, "Örnek Yazar 7", "1.7.2000");
        Book book8 = new Book("Örnek Kitap 8", 107, "Örnek Yazar 8", "1.8.2000");
        Book book9 = new Book("Örnek Kitap 9", 108, "Örnek Yazar 9", "1.9.2000");
        Book book10 = new Book("Örnek Kitap 10", 109, "Örnek Yazar 10", "1.10.2000");

        ArrayList<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        list.add(book7);
        list.add(book8);
        list.add(book9);
        list.add(book10);

        HashMap<String, String> map = new HashMap<>();

        list.stream().forEach(book -> map.put(book.getName(), book.getAuthor()));

        ArrayList<Book> filteredList = new ArrayList<>();
        list.stream().filter(book -> book.getPageCount() > 100).forEach(book -> filteredList.add(book));

        System.out.println(filteredList);


    }
}
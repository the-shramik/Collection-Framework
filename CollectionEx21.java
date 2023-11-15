import java.util.LinkedList;
import java.util.ListIterator;

class Book {
    int id;
    String name;
    String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;

    }
}

public class CollectionEx21 {
    public static void main(String[] args) {

        LinkedList<Book> ll = new LinkedList<Book>();
        ll.add(new Book(01, "java", "james"));
        ll.add(new Book(02, "cpp", "tony"));
        ll.add(new Book(03, "C", "denny"));
        ll.add(new Book(04, "python", "russy"));

        ListIterator<Book> lstr = ll.listIterator();

        while (lstr.hasNext()) {
            Book b = lstr.next();

            if (b.name.equalsIgnoreCase("c")) {
                lstr.remove();
            }
        }

        for (Book b : ll) {
            System.out.println(b.id + " " + b.name + " " + b.author);
        }
    }
}

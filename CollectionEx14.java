import java.util.ArrayList;
import java.util.Iterator;

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

public class CollectionEx14 {
    public static void main(String[] args) {

        ArrayList<Book> al = new ArrayList<Book>();
        al.add(new Book(001, "c++", "john"));
        al.add(new Book(002, "java", "james"));
        al.add(new Book(003, "C", "danny"));
        al.add(new Book(004, "python", "russy"));

        Iterator<Book> itr = al.iterator();

        for (Book b : al) {
            System.out.print(b.id + " " + b.name + " " + b.author + " ");
        }

        while (itr.hasNext()) {
            Book b = itr.next();

            if (b.id == 003) {
                itr.remove();
            }
        }

        System.out.println(" ");
        for (Book b : al) {
            System.out.print(b.id + " " + b.name + " " + b.author + " ");
        }

    }
}

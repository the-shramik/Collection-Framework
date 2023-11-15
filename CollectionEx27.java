import java.util.Collections;
import java.util.LinkedList;

class Product implements Comparable<Product> {
    int pid;
    String pname;

    public Product(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    public int compareTo(Product p) {
        if (pid == p.pid) {
            return 0;
        } else if (pid > p.pid) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class CollectionEx27 {
    public static void main(String[] args) {

        LinkedList<Product> ll = new LinkedList<Product>();

        ll.add(new Product(444, "table"));
        ll.add(new Product(111, "mouse"));
        ll.add(new Product(222, "keyboard"));
        ll.add(new Product(333, "pen"));

        Collections.sort(ll);

        for (Product p : ll) {
            System.out.println(p.pid + " " + p.pname);
        }
    }
}

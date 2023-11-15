import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

class Product {
    int pid;
    String pname;
    double pcost;

    public Product(int pid, String pname, double pcost) {
        this.pid = pid;
        this.pname = pname;
        this.pcost = pcost;
    }
}

public class CollectionEx18 {
    public static void main(String[] args) {

        Vector<Product> v = new Vector<Product>();
        v.add(new Product(1001, "bat", 1500.32));
        v.add(new Product(1002, "ball", 700.32));
        v.add(new Product(1003, "stumps", 1000.32));

        // enumeration cursor:

        Enumeration<Product> e = v.elements();
        System.out.println("Enumeration cursor:");
        while (e.hasMoreElements()) {
            Product p = e.nextElement();
            System.out.println(p.pid + " " + p.pname + " " + p.pcost);
        }

        System.out.println(" ");
        // iterator cursor

        Iterator<Product> itr = v.iterator();
        System.out.println("Iterator cursor:");
        while (itr.hasNext()) {
            Product p = itr.next();
            System.out.println(p.pid + " " + p.pname + " " + p.pcost);
        }

        System.out.println(" ");

        // listiterator cursor:

        ListIterator<Product> lstr = v.listIterator();
        System.out.println("ListIterator cursor:");
        while (lstr.hasNext()) {
            Product p = lstr.next();
            System.out.println(p.pid + " " + p.pname + " " + p.pcost);
        }
    }
}

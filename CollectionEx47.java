import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

class Product {
    int pid;
    String pname;

    public Product(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }
}

class Customer {
    int cid;
    String cname;

    public Customer(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }
}

public class CollectionEx47 {
    public static void main(String[] args) {

        TreeMap<Product, Customer> tm = new TreeMap<Product, Customer>(new MyProductComp());

        tm.put(new Product(101, "pen"), new Customer(001, "monty"));
        tm.put(new Product(102, "notebook"), new Customer(002, "golu"));
        tm.put(new Product(103, "pencil"), new Customer(003, "tony"));

        Set<Entry<Product, Customer>> st = tm.entrySet();
        Iterator<Entry<Product, Customer>> itr = st.iterator();

        while (itr.hasNext()) {
            Entry<Product, Customer> e = itr.next();

            Product p = e.getKey();
            System.out.print(p.pid + " " + p.pname + " ");

            Customer c = e.getValue();
            System.out.println(c.cid + " " + c.cname);
        }

    }
}

class MyProductComp implements Comparator<Product> {

    public int compare(Product p1, Product p2) {
        if (p1.pid == p2.pid) {
            return 0;
        } else if (p1.pid > p2.pid) {
            return -1;
        } else {
            return 1;
        }

    }
}

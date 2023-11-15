import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
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
    String cname;
    double money;

    public Customer(String cname, double money) {
        this.cname = cname;
        this.money = money;
    }
}

public class CollectionEx41 {
    public static void main(String[] args) {

        LinkedHashMap<Product, Customer> lhm = new LinkedHashMap<Product, Customer>();

        lhm.put(new Product(01, "sugar"), new Customer("ram", 59.43));
        lhm.put(new Product(02, "soap"), new Customer("sham", 10.32));
        lhm.put(new Product(03, "rice"), new Customer("monu", 70.42));

        // printing keys

        // Set<Product> s = lhm.keySet();
        // for (Product p : s) {
        // System.out.println(p.pid + " " + p.pname);
        // }

        for (Product p : lhm.keySet()) {
            System.out.println(p.pid + " " + p.pname);
        }

        // printing values
        for (Customer c : lhm.values()) {
            System.out.println(c.cname + " " + c.money);
        }

        // printing entries

        Set<Entry<Product, Customer>> st = lhm.entrySet();

        Iterator<Entry<Product, Customer>> itr = st.iterator();

        while (itr.hasNext()) {

            Entry<Product, Customer> e = itr.next();
            Product p = e.getKey();
            System.out.print(p.pid + " " + p.pname + " ");

            Customer c = e.getValue();
            System.out.println(c.cname + " " + c.money);
        }

    }
}

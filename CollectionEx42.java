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

public class CollectionEx42 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, Product> lhm = new LinkedHashMap<Integer, Product>();
        lhm.put(101, new Product(001, "cycle"));
        lhm.put(102, new Product(002, "laptop"));
        lhm.put(103, new Product(003, "book"));

        Set<Entry<Integer, Product>> st = lhm.entrySet();

        Iterator<Entry<Integer, Product>> itr = st.iterator();

        while (itr.hasNext()) {
            Entry<Integer, Product> e = itr.next();

            Product p = e.getValue();
            if (p.pid == 001) {
                itr.remove();
            }
        }

        for (int i : lhm.keySet()) {
            System.out.println(i + " ");

        }

        for (Product p : lhm.values()) {
            System.out.println(p.pid + " " + p.pname);
        }
    }
}

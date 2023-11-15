import java.util.Collections;
import java.util.LinkedList;

public class CollectionEx28 {
    public static void main(String[] args) {

        LinkedList<Product2> ll = new LinkedList<Product2>();

        ll.add(new Product2(102, "aaa"));
        ll.add(new Product2(103, "ccc"));
        ll.add(new Product2(101, "ooo"));
        ll.add(new Product2(104, "sss"));

        Collections.sort(ll, new PnameComp());

        for (Product2 p : ll) {
            System.out.println(p.id + " " + p.name);
        }
    }
}

import java.util.Iterator;
import java.util.Vector;

public class CollectionEx17 {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>();

        for (int i = 1; i <= 30; i++) {
            v.add(i);
        }

        System.out.println(v);

        Iterator<Integer> itr = v.iterator();
        while (itr.hasNext()) {
            int x = itr.next();

            if (x % 2 == 0) {
                System.out.println(x);
            } else {
                itr.remove();
            }
        }

        System.out.println(v);

    }
}

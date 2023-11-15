import java.util.ArrayList;
import java.util.Iterator;

public class CollectionEx13 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("ratan");
        al.add("anu");
        al.add("durga");
        al.add("sravya");

        System.out.println(al);
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equals("sravya")) {
                itr.remove();
            }
        }

        System.out.println(al);
    }
}

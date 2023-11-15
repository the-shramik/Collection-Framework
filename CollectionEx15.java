import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionEx15 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ratan");
        al.add("anu");
        al.add("durga");
        al.add("sravya");

        ListIterator<String> lstr = al.listIterator();

        for (String s : al) {
            System.out.print(s + " ");
        }
        lstr.add("hema");
        while (lstr.hasNext()) {
            String s = lstr.next();

            if (s.equals("durga")) {
                lstr.remove();
            }

            if (s.equals("anu")) {
                lstr.set("anushka");
            }
        }

        System.out.println("");
        for (String s : al) {
            System.out.print(s + " ");
        }

    }
}

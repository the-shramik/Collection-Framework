import java.util.Enumeration;
import java.util.Vector;

public class CollectionEx9 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("guru");
        v.add("albu");
        v.add("siya");
        v.add("nayra");

        // reading by cursor :normal
        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            String s = (String) e.nextElement();
            System.out.println(s);
        }

        // reading data by cursor: generic

        Enumeration<String> e1 = v.elements();
        while (e1.hasMoreElements()) {
            String s = e1.nextElement();
            System.out.println(s);
        }
    }
}

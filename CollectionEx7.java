import java.util.ArrayList;
import java.util.Arrays;

public class CollectionEx7 {
    public static void main(String[] args) {

        // arrays------>collections
        String[] str = { "aaa", "bbb", "ccc" };
        ArrayList<String> al1 = new ArrayList<String>(Arrays.asList(str));
        al1.add("ddd");
        al1.add("eee");

        System.out.println(al1);

        for (String s : al1) {
            System.out.println(s);
        }

        // collections------>arrays
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("guru");
        al2.add("albu");
        al2.add("siya");

        String[] sarr = new String[al2.size()];
        al2.toArray(sarr);

        System.out.println(sarr[0]);

        for (String s : sarr) {
            System.out.println(s);
        }

        // collection----->Array without generics
        ArrayList al3 = new ArrayList();
        al3.add(19);
        al3.add("guru");
        al3.add(89.32);
        al3.add('e');

        Object[] obj = new Object[al3.size()];
        obj = al3.toArray();

        System.out.println(obj[2]);
        // for (Object o : obj) {
        // System.out.println(o);
        // }
    }
}

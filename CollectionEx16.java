import java.util.Vector;
import java.util.ArrayList;

public class CollectionEx16 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("aalbu");
        al.add("soni");
        al.add("moni");

        Vector<String> v = new Vector<String>(al);
        v.add("guru");
        v.add("sanket");
        v.add("sahil");
        v.add("shubham");
        v.add("rohan");
        v.add("shravan");

        System.out.println(v.capacity());

        for (String s : v) {
            System.out.println(s);
        }
    }
}

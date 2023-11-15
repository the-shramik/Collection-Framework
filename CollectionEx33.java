import java.util.ArrayList;
import java.util.HashSet;

public class CollectionEx33 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(10);

        System.out.println(al);

        HashSet<Integer> hs = new HashSet<Integer>(al);
        System.out.println(hs);
    }
}

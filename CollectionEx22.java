import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionEx22 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("guru;");
        al.add("siya");
        al.add("albu");
        al.add("nayra");

        System.out.println("Before Sorting: " + al);
        Collections.sort(al);
        System.out.println("After Sorting: " + al);

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(30);
        ll.add(42);
        ll.add(14);
        ll.add(12);
        System.out.println("Before Sorting: " + ll);
        Collections.sort(ll);
        System.out.println("After Sorting: " + ll);

    }
}

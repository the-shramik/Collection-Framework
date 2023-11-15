import java.util.ArrayList;
import java.util.Collections;

public class CollectionEx8 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("sonu");
        al.add("john");
        al.add("monty");
        al.add("siya");

        System.out.println(al.subList(0, 2));

        System.out.println(al);
        Collections.swap(al, 3, 1);
        System.out.println(al);
    }
}

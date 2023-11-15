import java.util.ArrayList;

public class CollectionEx1 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20.3);
        al.add('c');
        al.add("shramik");
        al.add(20.3);
        al.add(null);

        System.out.println(al);
    }
}
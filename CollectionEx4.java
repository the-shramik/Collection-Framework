import java.util.ArrayList;

public class CollectionEx4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20.4);
        al.add("guru");
        al.add('s');
        al.add(10);
        al.add(null);

        System.out.println(al);

        al.remove(3);
        System.out.println(al);

        al.add(1, "albu");
        System.out.println(al);

        al.set(4, "siya");
        System.out.println(al);

        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());

    }
}

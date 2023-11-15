import java.util.ArrayList;

public class CollectionEx5 {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);

        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(100);
        al2.add(200);

        ArrayList<Integer> al3 = new ArrayList<Integer>();
        al3.add(1000);
        al3.add(2000);
        al3.addAll(al2);
        al3.addAll(al1);
        System.out.println(al3);
    }
}

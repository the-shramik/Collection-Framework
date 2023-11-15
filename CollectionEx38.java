import java.util.ArrayList;

public class CollectionEx38 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("java");
        al.add("c++");
        al.add("python");

        ArrayList<String> copy = (ArrayList<String>) al.clone();

        al.add("ASP");
        System.out.println(al);
        System.out.println(copy);

    }
}

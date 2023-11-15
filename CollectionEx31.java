import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionEx31 {
    public static void main(String[] args) {

        HashSet<String> sh = new HashSet<String>();
        sh.add("guru");
        sh.add("albu");
        sh.add("nayra");

        System.out.println(sh);

        LinkedHashSet<String> lh = new LinkedHashSet<String>(sh);
        lh.add("siya");
        lh.add("rocky");

        System.out.println(lh);
    }
}

import java.util.Comparator;

public class PnameComp implements Comparator<Product2> {

    public int compare(Product2 p1, Product2 p2) {
        return p2.name.compareTo(p1.name);
    }
}

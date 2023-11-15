import java.util.Comparator;

public class PidComp implements Comparator<Product2> {

    public int compare(Product2 p1, Product2 p2) {

        if (p1.id == p2.id) {
            return 0;
        } else if (p1.id > p2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

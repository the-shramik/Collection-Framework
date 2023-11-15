import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product> {
    int id;
    String name;
    double cost;

    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int compareTo(Product p) {

        if (cost == p.cost) {
            return 0;
        } else if (cost > p.cost) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class CollectionEx25 {
    public static void main(String[] args) {

        ArrayList<Product> al = new ArrayList<Product>();

        al.add(new Product(101, "headphones", 2500.342));
        al.add(new Product(102, "keyboard", 500.32));
        al.add(new Product(103, "laptop", 45028.42));
        al.add(new Product(104, "charger", 2000.42));

        Collections.sort(al);

        for (Product p : al) {
            System.out.println(p.id + " " + p.name + " " + p.cost);
        }
    }
}

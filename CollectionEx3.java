import java.util.ArrayList;

class Product {
    int pid;
    String pname;
    double pcost;

    public Product(int pid, String pname, double pcost) {
        this.pid = pid;
        this.pname = pname;
        this.pcost = pcost;
    }
}

public class CollectionEx3 {
    public static void main(String[] args) {

        ArrayList<Product> al = new ArrayList<Product>();

        al.add(new Product(101, "soap", 56.8));
        al.add(new Product(102, "sugar", 40.54));
        al.add(new Product(103, "brush", 40.32));

        for (Product p : al) {
            System.out.println(p.pid + " " + p.pname + " " + p.pcost);
        }
    }
}

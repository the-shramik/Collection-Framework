public class CloneingEx implements Cloneable {
    int a = 10;
    int b = 20;

    public static void main(String[] args) throws CloneNotSupportedException {

        CloneingEx c1 = new CloneingEx();
        System.out.println(c1.a);
        System.out.println(c1.b);

        CloneingEx c2 = (CloneingEx) c1.clone();
        System.out.println(c2.a);
        System.out.println(c2.b);

        c1.a += 1000;
        c1.b += 2000;
        System.out.println(c1.a);
        System.out.println(c1.b);

        System.out.println(c2.a);
        System.out.println(c2.b);

    }
}

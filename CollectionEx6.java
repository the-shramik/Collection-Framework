import java.util.ArrayList;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class CollectionEx6 {
    public static void main(String[] args) {

        Employee e1 = new Employee(11, "guru");
        Employee e2 = new Employee(22, "albu");
        Employee e3 = new Employee(33, "siya");
        Employee e4 = new Employee(44, "alexa");

        ArrayList<Employee> al1 = new ArrayList<Employee>();
        al1.add(e1);
        al1.add(e2);

        ArrayList<Employee> al2 = new ArrayList<Employee>();
        al2.add(e3);
        al2.add(e4);
        al2.addAll(al1);

        System.out.println(al2.contains(e2));
        System.out.println(al2.containsAll(al1));
        // al2.remove(e2);
        // al2.removeAll(al1);
        al2.retainAll(al1);
        System.out.println(al2.contains(e2));
        System.out.println(al2.containsAll(al1));

        for (Employee e : al2) {
            System.out.println(e.id + " " + e.name);
        }

    }
}

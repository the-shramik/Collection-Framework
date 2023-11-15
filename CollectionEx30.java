import java.util.Iterator;
import java.util.LinkedHashSet;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class CollectionEx30 {
    public static void main(String[] args) {

        LinkedHashSet<Employee> lh = new LinkedHashSet<Employee>();

        lh.add(new Employee(111, "siya"));
        lh.add(new Employee(222, "alexa"));
        lh.add(new Employee(333, "siri"));

        Iterator<Employee> itr = lh.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();
            System.out.println(e.id + " " + e.name);
        }

    }
}

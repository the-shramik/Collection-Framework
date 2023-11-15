import java.util.HashSet;
import java.util.Iterator;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class CollectionEx29 {
    public static void main(String[] args) {

        HashSet<Employee> hs = new HashSet<Employee>();

        hs.add(new Employee(111, "guru", 75904.22));
        hs.add(new Employee(222, "albu", 65043.43));
        hs.add(new Employee(333, "siya", 45003.23));

        Iterator<Employee> itr = hs.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }
}

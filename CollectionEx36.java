import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

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

public class CollectionEx36 {
    public static void main(String[] args) {
        TreeSet<Employee> ts = new TreeSet<Employee>(new MyComp());
        ts.add(new Employee(333, "sara", 67394.43));
        ts.add(new Employee(111, "manoj", 86920.3));
        ts.add(new Employee(222, "gotu", 33368.4));

        Iterator<Employee> itr = ts.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();

            System.out.println(e.id + " " + e.name + " " + e.salary);
        }

    }
}

class MyComp implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {

        if (e1.id == e2.id) {
            return 0;
        } else if (e1.id > e2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

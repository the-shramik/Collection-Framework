import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Object o) {
        Employee emp = (Employee) o;

        if (id == emp.id) {
            return 0;
        } else if (id > emp.id) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class CollectionEx23 {
    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(55, "sara"));
        al.add(new Employee(22, "nayra"));
        al.add(new Employee(44, "rahila"));
        al.add(new Employee(33, "kirti"));
        al.add(new Employee(11, "sonu"));

        System.out.println("Before sorting:");
        for (Employee e : al) {
            System.out.println(e.id + " " + e.name);
        }
        Collections.sort(al);

        System.out.println("");
        System.out.println("After sorting:");
        for (Employee e : al) {
            System.out.println(e.id + " " + e.name);
        }

    }
}

import java.util.ArrayList;
import java.util.ListIterator;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class CollectionEx12 {
    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(111, "alexa"));
        al.add(new Employee(222, "sara"));
        al.add(new Employee(333, "shramik"));

        ListIterator lstr1 = al.listIterator();
        System.out.println("forword:");
        while (lstr1.hasNext()) {
            Employee emp = (Employee) lstr1.next();
            System.out.println(emp.id + " " + emp.name);
        }

        ListIterator<Employee> lstr2 = al.listIterator(al.size());
        System.out.println("backward:");
        while (lstr2.hasPrevious()) {
            Employee emp = lstr2.previous();
            System.out.println(emp.id + " " + emp.name);
        }
    }
}

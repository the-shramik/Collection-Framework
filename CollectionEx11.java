import java.util.ArrayList;

import java.util.Iterator;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class CollectionEx11 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(111, "guru"));
        al.add(new Employee(222, "albu"));
        al.add(new Employee(333, "siya"));

        // cursor:normal
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Employee emp = (Employee) itr.next();
            System.out.println(emp.id + " " + emp.name);
        }

        // cursor:generic
        Iterator<Employee> itr1 = al.iterator();
        while (itr1.hasNext()) {
            Employee emp = itr1.next();
            System.out.println(emp.id + " " + emp.name);
        }

    }
}
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Employee implements Serializable {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class CollectionEx39 {

    public static void main(String[] aegs) throws IOException, ClassNotFoundException {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(111, "shramik", 78945.39));
        al.add(new Employee(222, "alvira", 60233.12));
        al.add(new Employee(333, "siya", 56433.43));

        // serialization
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(al);
        System.out.println("Serialization done!");
        oos.close();

        // deserialization
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Employee> ale = (ArrayList<Employee>) ois.readObject();

        for (Employee e : ale) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }

        ois.close();

    }
}

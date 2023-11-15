import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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

public class SerialixationEx {

    public void serialization() {

        try {

            Employee emp = new Employee(777, "shramik", 78459.343);
            FileOutputStream fos = new FileOutputStream("abc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            System.out.println("Serialization is done!");
            Thread.sleep(2000);
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void desrialization() {
        try {
            FileInputStream fis = new FileInputStream("abc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee e = (Employee) ois.readObject();
            System.out.println(e.id + " " + e.name + " " + e.salary);
            System.out.println("desrialization is done!");
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        SerialixationEx se = new SerialixationEx();

        se.serialization();
        se.desrialization();
    }
}

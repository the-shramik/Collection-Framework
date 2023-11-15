import java.util.ArrayList;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Student {
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}

public class CollectionEx2 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(new Employee(111, "guru"));
        al.add(new Student(101, "siya"));
        al.add(10);
        al.add("albu");
        al.add(null);

        for (Object o : al) {
            if (o instanceof Employee) {
                Employee e = (Employee) o;

                System.out.println(e.id + " " + e.name);
            }
            if (o instanceof Student) {
                Student s = (Student) o;

                System.out.println(s.rollno + " " + s.name);
            }

            if (o instanceof Integer) {
                System.out.println(o);
            }

            if (o instanceof String) {
                System.out.println(o);
            }
            if (o == null) {
                System.out.println(o);
            }
        }
    }
}

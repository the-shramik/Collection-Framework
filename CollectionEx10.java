import java.util.Enumeration;
import java.util.Vector;

class Student {
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}

public class CollectionEx10 {
    public static void main(String[] args) {

        Vector<Student> v = new Vector<Student>();
        v.add(new Student(11, "sonu"));
        v.add(new Student(22, "monty"));
        v.add(new Student(33, "om"));

        Enumeration<Student> e = v.elements();

        while (e.hasMoreElements()) {
            Student s = e.nextElement();
            System.out.println(s.rollno + " " + s.name);
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;

class Alphabate implements Comparable<Alphabate> {
    int ind;
    String word;

    public Alphabate(int ind, String word) {
        this.ind = ind;
        this.word = word;
    }

    public int compareTo(Alphabate a) {

        return word.compareTo(a.word);
    }

}

public class CollectionEx24 {
    public static void main(String[] args) {

        ArrayList<Alphabate> al = new ArrayList<Alphabate>();

        al.add(new Alphabate(01, "ggg"));
        al.add(new Alphabate(02, "bbb"));
        al.add(new Alphabate(03, "sss"));
        al.add(new Alphabate(04, "aaa"));
        al.add(new Alphabate(05, "ccc"));

        System.out.println("Before sorting:");
        for (Alphabate a : al) {
            System.out.println(a.ind + " " + a.word);
        }

        Collections.sort(al);

        System.out.println("After sorting:");
        for (Alphabate a : al) {
            System.out.println(a.ind + " " + a.word);
        }
    }
}

import java.util.LinkedList;

public class CollectionEx20 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);

        System.out.println(ll);
        System.out.println("Size= " + ll.size());

        ll.addFirst(000);
        ll.addLast(800);
        System.out.println(ll);
        System.out.println("Size= " + ll.size());

        ll.add(5, 500);
        ll.set(6, 600);

        System.out.println(ll);

        ll.remove(000);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        System.out.println(ll.isEmpty());
        ll.removeAll(ll);
        System.out.println(ll.isEmpty());
    }
}

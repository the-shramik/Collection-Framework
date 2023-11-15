import java.util.Iterator;
import java.util.Stack;

public class CollectionEx19 {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();

        st.push("guru");
        st.push("albu");
        st.push("siya");

        System.out.println(st);
        st.pop();
        System.out.println(st);

        System.out.println(st.search("albu"));

        System.out.println(st.empty());
        st.add("sara");
        st.add("mahi");

        Iterator<String> itr = st.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            System.out.println(s);
        }
    }
}
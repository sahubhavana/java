import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st);

        st.pop();

        System.out.println(st);

        System.out.println("Top element: " + st.peek());

        System.out.println(st.isEmpty());
    }
}

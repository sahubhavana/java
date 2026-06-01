import java.util.*;

class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    public void push(int val) {

        st.push(val);

        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    }

    public void pop() {

        if (st.peek().equals(minSt.peek())) {
            minSt.pop();
        }

        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }
}

public class Main {

    public static void main(String[] args) {

        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(2);
        ms.push(8);
        ms.push(1);

        System.out.println(ms.getMin());

        ms.pop();

        System.out.println(ms.getMin());
    }
}

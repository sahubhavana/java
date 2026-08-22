class Solution {

    void reverse(Stack<Integer> st) {
        if (st.isEmpty())
            return;

        int x = st.pop();      // Remove top element

        reverse(st);           // Reverse remaining stack

        insertAtBottom(st, x); // Insert removed element at bottom
    }

    void insertAtBottom(Stack<Integer> st, int x) {

        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int temp = st.pop();

        insertAtBottom(st, x);

        st.push(temp);
    }
}

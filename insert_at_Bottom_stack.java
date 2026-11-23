class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here
        int x1=st.size();
        Stack<Integer> s = new Stack<>();
        while(x1!=0){
            s.push(st.pop());
            x1--;
        }
        s.push(x);
        x1=s.size();
        while(x1!=0){
            st.push(s.pop());
            x1--;
        }
        return st;
    }
}

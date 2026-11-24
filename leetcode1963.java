class Solution {
    
         
    public int minSwaps(String s) {
        Stack<Character>st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '[') {
                st.push(ch);
            }
            else {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }

        int open = st.size();

        return (open + 1) / 2;
    }
}

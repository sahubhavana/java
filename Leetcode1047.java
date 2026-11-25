class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        Stack<Character>st2=new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()|| st.peek()!=ch){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        while(!st.isEmpty()){
            st2.push(st.peek());
            st.pop();
        }
        while(!st2.isEmpty()){
            sb.append(st2.peek());
            st2.pop();
        }
        return sb.toString();
    }
}

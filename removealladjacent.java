class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> dq1=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(dq1.isEmpty()){
                   dq1.push(s.charAt(i));
            }
            else{
                if(dq1.peek()!=s.charAt(i)){
                    dq1.push(s.charAt(i));
                }
                else{
                       dq1.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        while(!dq1.isEmpty()){
            sb.append(dq1.pop());
        }

       return sb.reverse().toString();
    }
}

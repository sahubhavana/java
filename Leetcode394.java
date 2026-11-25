class Solution {
    
    public String decodeString(String s) {
        StringBuilder ans =new StringBuilder();
        Stack<Integer>st=new Stack<>();
        Stack<Character>st1=new Stack<>();
        StringBuilder a =new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int num=ch-'0';
                 while(i + 1 < s.length() &&
                      Character.isDigit(s.charAt(i + 1))) {

                    num = num * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }

                st.push(num);
            }
            else{
                if(ch==']'){
                a.setLength(0);
                  while(!st1.isEmpty()&&st1.peek()!='['){
                    
                        a.append(st1.peek());
                        st1.pop();
                    }
                    if(!st1.isEmpty()){
                    st1.pop();
                    }
                    a.reverse();
                    int x=st.peek();
                    st.pop();
                    String temp=a.toString().repeat(x);
                  
                  for(int j=0;j<temp.length();j++){
                    st1.push(temp.charAt(j));
                  }
                 
                }
                else{
                   st1.push(ch);
                }
            }
        }
        while(!st1.isEmpty()){
            ans.append(st1.pop());
    }
    return ans.reverse().toString();
    }
}

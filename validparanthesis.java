1.To check a parenthesis expression is valid or not

       Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
               st.push(s.charAt(i));
           }
           else{
               if(s.charAt(i)=='}' && st.peek()=='{')
                   st.pop();
               }
               if (s.charAt(i)==')' && st.peek()=='('){
                   st.pop();

               }
               if(s.charAt(i)==']' && st.peek()=='['){
                   st.pop();
               }
       }
     if(st.size()==0){
         System.out.print("balanced expression");
     }
     else{
         System.out.print("Not valid expression");
     }

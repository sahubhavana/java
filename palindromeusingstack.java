2.Program to check a string is palindrome or not using stack
       Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
           st.push(s.charAt(i));
       }
      boolean flag=true;
       for(int i=0;i<st.size();i++){
           char ch=st.pop();
           if(ch!=s.charAt(i)){
                flag=false;
           }

       }
       if(flag==true){
           System.out.print("palindrome");
       }
       else{
           System.out.print("Not palindrome");
       }
    }
}

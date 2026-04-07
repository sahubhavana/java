To check palindrome
       String s="madam";
       String y="";
       for(int i=0;i<s.length();i++){
           y=y+s.charAt(i);
       }
       if(y.equals(s)){
           System.out.println("It is palindrome");

       }
       else{
           System.out.println("it is not palindrome");
    }

5.To check a string is palindrome or not
       String result="";
       for(int i=str.length()-1;i>=0;i--){
           result=result+str.charAt(i);
       }
       if(result.equals(str)){
           System.out.print("String is palindrome");
       }
       else{
           System.out.print("string is not palindrome");
       }

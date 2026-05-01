7.Converting a lowercase character to uppercase without method

       String result="";
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch>='a'&& ch<='z'){
               ch=(char)(ch-32);
           }
           result=result+ch;
       }
     System.out.print(result);


  

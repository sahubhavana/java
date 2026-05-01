10.Program to check a string contain only digit or not
       boolean check=true;
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)>='a' && str.charAt(i)<='z'){
               check=false;
               break;
           }
       }
       System.out.print(check);

9.Remove all the space from string
       String result=" ";

       for(int i=0;i<str.length();i++){

           if(str.charAt(i)!=' '){
               result=result+str.charAt(i);

               }
           }
       System.out.print("After replacement of space="+result);

 for(int i=0;i<str.length();i++){
         String res="";
         if(str.charAt(i)==' '){
             res=res+'@';
         }
         res=res+str.charAt(i);
     }
     System.out.print(res);

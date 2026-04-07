 String s1="I am learning a java programming";
     String s[]=s1.split(" ");
     String s2="";
     for(String word:s){
         if(word.length()>s2.length()){
             s2=word;
         }
     }
     System.out.println("Longest word of sentence is="+s2);}

   }

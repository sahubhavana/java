8.To count or find a frequency of each character
       int countf=0;
       for(int i=0;i<str.length();i++){
           for(int j=0;j<str.length();j++){
               if(str.charAt(i)==str.charAt(j)){
                   countf++;
               }

           }
           System.out.println("count of="+str.charAt(i)+" "+countf);
           countf=0;
       }

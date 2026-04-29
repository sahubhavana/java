  int st;
       for(int i=0;i<n;i++){
           if(i%2==0){
               st=1;
           }
           else{
               st=0;
           }
           for(int j=0;j<=i;j++){
               System.out.print(st);
               if(st==0){
                   st++;
               }
               else{
                   st=st-1;
               }
           }
           System.out.println();
       }

   int count=1;
       for(int i=n;i>0;i--){
           for(int k=0;k<n-i;k++){
               System.out.print(" ");
           }
           for(int j=0;j<i;j++){
               System.out.print(count);
           }
           count=count+1;
           System.out.println();
       }

//  16.
       for(int i=0;i<n;i++){
           for(int k=1;k<n-i;k++){
               System.out.print(" ");
           }
           for(int j=0;j<=i;j++){
               System.out.print((char)('A'+j));
           }
           for(int j=i-1;j>=0;j--){
               System.out.print((char)('A'+j));

           }
           System.out.println();
     }

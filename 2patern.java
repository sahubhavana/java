 System.out.println("eneter a value of n or m=");
        int n = sc.nextInt();
2       int m=sc.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
               if(i==1||j==1|| i==n|| j==n){
                   System.out.print("*");
               }
               else {
                   System.out.print(" "); // important
               }
           }
           System.out.println();
       }

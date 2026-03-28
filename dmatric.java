int[][] marks=new int[2][2];
       for(int i=0;i<2;i++){
           for(int j=0;j<2;j++){
               System.out.println("Enter a element");
               marks[i][j]=sc.nextInt();
           }
       }
       System.out.println("Enter a element to search");
       int number=sc.nextInt();
       for(int i=0;i<2;i++){
           for(int j=0;j<2;j++){
               if(marks[i][j]!=number){

               }
               else{
                   System.out.println("Index of element"+i+j);
               }
           }
       }

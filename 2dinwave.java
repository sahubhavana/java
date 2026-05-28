66.print array in wave nature
       int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       int k=0;
       for(int i=0;i<arr.length;i++){
           if((i&1)==1){
               for(int j=arr.length-1;j>=0;j--){
                   System.out.print(arr[j][k]+" ");
               }k++;
               System.out.println();
           }
           else{
               for(int j=0;j<arr.length;j++){
                   System.out.print(arr[j][k]+" ");
               }k++;
               System.out.println();
           }
       }

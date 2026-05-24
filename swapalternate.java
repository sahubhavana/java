//  45.Swap Alternate element in array
     int arr[]={2,1,4,3,5};
     for(int i=0;i<=arr.length-2;i=i+2){
         int temp=arr[i];
         arr[i]=arr[i+1];
         arr[i+1]=temp;

     }
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }

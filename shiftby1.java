//  49.Shift element of array by 1 position
       int arr[]={10,20,30,40,50,60,70};
       int temp=arr[0];
       arr[0]=arr[arr.length-1];

       for(int i=arr.length-1;i>1;i--){
           arr[i]=arr[i-1];
       }
       arr[1]=temp;
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }

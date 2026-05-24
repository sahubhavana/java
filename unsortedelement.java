//  44.find unsorted element in array
       int arr[]={1,2,3,4,5,6,7,8,10,9};
       for(int i=0;i<arr.length-1;i++){
           if(arr[i]<arr[i+1]){

           }
           else {
               System.out.print("unsorted array element=" + arr[i]);
               break;
           }
       }

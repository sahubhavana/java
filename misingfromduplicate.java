//  62.find missing number from duplicate number
   int arr[]={1,4,4,5,2,2};
   Arrays.sort(arr);
   for(int i=0;i<arr.length-1;i++){
       if(arr[i]+1!=arr[i+1]){
           System.out.println("Missing element:"+(arr[i]+1));
           break;
       }
       }

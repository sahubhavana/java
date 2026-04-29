 31.Largest subarray with sum 0
       int arr[]={15, -2, 2, -8, 1, 7, 10, 23};
       int maxlen=0;

       for(int i=0;i<arr.length;i++){
           int count=0;
           int sum=0;
           for(int j=i;j<arr.length;j++){
               sum=sum+arr[j];
               count++;

               if(sum==0){
                   if(count>maxlen){
                       maxlen=count;
                   }
               }
           }
       }
       System.out.println("length of array="+maxlen);

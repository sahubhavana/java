8.Best way of solving a three sum
       int arr[]={-1,0,1,2,-1,-4};
       Arrays.sort(arr);
       int target=sc.nextInt();
           for(int i=0;i<arr.length-2;i++){
               int j=i+1;
               int k=arr.length-1;
               while(j<k){
                   if(arr[i]+arr[j]+arr[k]==target){
                       System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
                       j++;
                       k--;
                       break;
                   }
                   else {
                       if ((arr[i] + arr[j] + arr[k] )< target) {
                           j++;
                       } else {
                           k--;
                       }
                   }

               }
           }

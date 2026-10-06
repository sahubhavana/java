public static int peakindex(int[]arr){
        int ans=-1;
//        for(int i=1;i<arr.length-1;i++){
//            if((arr[i]>arr[i-1])&& (arr[i]>arr[i+1])){
//                ans=i;
//            }
//        }
//       return ans;

       int s=0;
       int e=arr.length-1;
       while(s<=e){
           int mid=s+(e-s)/2;
           if(arr[mid]>=arr[mid+1]){
               ans=mid;
              e=mid-1;
           }
           else{

               s=mid+1;
           }
       }

  return ans;

    }

static boolean isvalidanswer(int[] arr,int k,int mid){
        int studentcount=1;
        int sumpage=0;

        for(int i=0;i<arr.length;i++){
            if(sumpage+arr[i]<=mid){
                sumpage=sumpage+arr[i];
            }
            else{
                studentcount++;
                if(studentcount>k||arr[i]>mid){
                    return false;
                }
                else{
                    sumpage=0;
                    sumpage=sumpage+arr[i];
                }
            }

        }
        return true;
    }

//     Optimal solution for Book allocation
       public static int find_page(int[] arr,int k){
           int n=arr.length;
           if(arr.length<k){
               return -1;
           }
           int start=1;
           int sum=0;
           for(int i=0;i<n;i++){
               sum=sum+arr[i];
           }
           int end=sum;
           int ans=-1;
           while(start<=end){
               int mid=start+(end-start)/2;
               if(isvalidanswer(arr,k,mid)){
                   ans=mid;
                   end=mid-1;
               }
               else{
                   start=mid+1;
               }
           }
       return ans;

 }

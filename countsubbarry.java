26.Count subarray with a given sum
       int nums[]={1,2,3};
       int k=sc.nextInt();
       int count=0;
       for(int i=0;i<nums.length;i++){
           int sum=0;
           for(int j=i;j<nums.length;j++){
               sum=sum+nums[j];
               if(sum==k){
                   count=count+1;
               }
           }
       }
       System.out.print("count of subarray="+count);

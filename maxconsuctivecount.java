public int findMaxConsecutiveOnes(int[] nums) {
     int sum=0;
         int count=0;
         int newcount=0;
         for(int i=0;i<nums.length;i++){
             sum=0;
             for(int j=i;j<nums.length;j++){
                 sum=sum+nums[j];

             if(sum==k){
                 count=j-i+1;
                 newcount=Math.max(count,newcount);
             }
             }
            
         }
         return newcount;

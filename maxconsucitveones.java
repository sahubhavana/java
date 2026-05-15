public int findMaxConsecutiveOnes(int[] nums) {
        int newcount=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count=count+1;

            }
            else{
                if(count>newcount){
                    newcount=count;
                    count=0;

                }
            }
        }
        return newcount;
    }
}

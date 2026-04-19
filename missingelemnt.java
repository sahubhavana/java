13.Finding a missing element from array
       int nums[]={0,1,2,4,5};
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=i){
               System.out.println(i);
           }

       }
       System.out.println( nums.length);

 int nums[]={1, 2, 2, 4, 3, 1,4};

       int count=0;
       for(int i=0;i<nums.length;i++){
           for(int j=0;j<nums.length;j++){
               if(nums[i]==nums[j]){
                   count=count+1;
               }
           }
           if(count==1){
               System.out.println("Element which can 1 ocuurence="+nums[i]);

           }
           count=0;
       }

11.shift zero at last
       int nums[] = {0, 1, 4, 0, 5, 2};
       int temp;
       int j=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               temp=nums[j];

                   nums[j]=nums[i];
                   nums[i]=temp;
               j++;
           }
       }
       for (int i = 0; i < nums.length; i++) {


           System.out.print(nums[i] + " ");
      }

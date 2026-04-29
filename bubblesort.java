32.Bubbble sort algorithm
       int temp;

       int [] nums={2,33,4,5,6,78,90};
       for(int i=0;i<=nums.length-1;i++){
           boolean swap=false;
           for(int j=0;j<nums.length-i-1;j++){
               if(nums[j]>nums[j+1]){
                   swap=true;
                   temp=nums[j];
                   nums[j]=nums[j+1];
                   nums[j+1]=temp;

               }
           }
           if(swap==false){
               break;
           }
       }
       for(int i=0;i<nums.length;i++){
           System.out.print(nums[i]+" ");
       }

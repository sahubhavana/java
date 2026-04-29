34.Return a reverse pair if nums[i]>2*nums[j]
     int[] nums={6, 4, 1, 2, 7};
       int revepair=0;
       for(int i=0;i<nums.length-1;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]>2*nums[j]){
                   revepair++;
               }
           }
       }
       System.out.print("total number of revrse pair="+revepair);

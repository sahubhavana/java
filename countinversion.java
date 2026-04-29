33.count inversion if nums[i]>nums[j] ans i<j
       int[] nums = {2, 3, 7, 1, 3, 5};
       int incount = 0;
       for (int i = 0; i < nums.length - 1; i++) {
           for (int j = i + 1; j < nums.length; j++) {
               if (nums[i] > nums[j] && i < j) {
                   incount++;
               }
           }
       }
       System.out.print("total no of inverson count=" + incount);

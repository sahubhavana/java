8.Majority-!! print majority elemnent
       int nums[] = {1, 2, 1, 1, 3, 2, 2, 3};
       List<Integer> ans = new ArrayList<>();
       int n = nums.length / 3;
       int count = 0;
       for (int i = 0; i < nums.length; i++) {
           for (int j = i; j < nums.length; j++) {
               if (nums[i] == nums[j]) {
                   count++;
               }
           }
           if (count > n) {
               ans.add(nums[i]);
           }
           count = 0;
       }
       for(int i=0;i<ans.size();i++){
           System.out.print(ans.get(i)+" ");
       }

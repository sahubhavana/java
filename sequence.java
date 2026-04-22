24.Cosecutive sequence in the array
       int nums[]={100, 4, 200, 1, 3, 2};
       HashSet<Integer> ans = new HashSet<>();
       for(int i=0;i<nums.length;i++){
           for(int j=0;j<nums.length;j++){
               if(i==nums[j]){
                   ans.add(i);
               }
           }
       }
       System.out.print(ans.size());

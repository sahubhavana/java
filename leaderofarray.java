Leader of the array
   int nums[]={1,2,5,3,1,2};
       List<Integer> ans = new ArrayList<>();
       boolean leader=true;
       for(int i=0;i<nums.length;i++){
           leader=true;
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]<nums[j]){
                   leader=false;
                   break;
               }

           }
           if(leader==true){
               ans.add(nums[i]);
           }
       }
       for(int i=0;i<ans.size();i++){
           System.out.print(ans.get(i)+" ");

       }

14.Finding a maximum consecutive sum of 1
       int nums={1, 1, 0, 0, 1, 1, 1, 0};
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
       System.out.print("Maximum consecutive sumof 1="+newcount);

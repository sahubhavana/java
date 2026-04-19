16.find a maximum length of array of sum ==k
         int nums[]={10, 5, 2, 7, 1, 9};
         int k;
         System.out.println("enter a value of k=");
         k=sc.nextInt();
         int sum=0;
         int count=0;
         int newcount=0;
         for(int i=0;i<nums.length;i++){
             sum=0;
             for(int j=i;j<nums.length;j++){
                 sum=sum+nums[j];

             if(sum==k){
                 count=j-i+1;
                 newcount=Math.max(count,newcount);
             }
             }

         }
       System.out.println("Maximum consecutive length of array="+newcount);

0.Kaddane Algorithm to find maximum sum
            int nums[]={2,3,5,-2,7.-4};
            int sum=0;
            int fsum=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                sum=0;
               for(int j=i;j<nums.length;j++){
                   sum=sum+nums[j];
                   if(sum>fsum){
                       fsum=sum;

               }
           }
       }
            System.out.println("Maximum sum of element="+fsum);

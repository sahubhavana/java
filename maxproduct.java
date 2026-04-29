35.MAximum product in  subarray
       int [] nums={4, 5, 3, 7, 1, 2};
       int ipro=1;
       int fpro=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           for(int j=i;j<nums.length;j++){
               ipro=ipro*nums[j];
               if(ipro>fpro){
                   fpro=ipro;
               }
           }

           ipro=1;
       }
      System.out.print("Maximum product of subarray="+fpro);

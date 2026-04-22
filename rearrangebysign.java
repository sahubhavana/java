22.Rearrange array elemnent by sign
       int nums[]={2, 4, 5, -1, -3, -4};
        int result[]=new int[nums.length];
       int[] pos = new int[nums.length];
       int[] neg= new int[nums.length];
       int p=0;
       int n=0;
       for(int i=0;i< nums.length;i++){
          if (nums[i]>0){
              pos[p]=nums[i];
              p=p+1;
          } else if (nums[i]<0) {
              neg[n]=nums[i];
              n=n+1;

          }

          }
       int i=0,j=0,k=0;
       while (i < p && j < n) {
           result[k++] = pos[i++];
           result[k++] = neg[j++];
       }

       // Add remaining elements
       while (i < p) result[k++] = pos[i++];
       while (j < n) result[k++] = neg[j++];

       // Print result
       for (int x : result) {
           System.out.print(x + " ");
       }

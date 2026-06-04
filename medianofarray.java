class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length+nums2.length;
        int[] num3=new int[n1];
        int idx=0;
        int temp=0;
    
        
        for (int n : nums1) num3[idx++] = n;
        for (int n : nums2) num3[idx++] = n;
        int st=0;
        int end=num3.length-1;
        while(st<=end){
        for(int i=0;i<num3.length-1;i++){
            if(num3[i]<num3[i+1]){
            }
            else{
                temp=num3[i];
                num3[i]=num3[i+1];
                num3[i+1]=temp;

            }

        }
        
        st=st+1;
        }
        if((num3.length)%2==0){
            return (num3[num3.length/2 - 1] + num3[num3.length/2]) / 2.0;
       
        }
        
        else{
            return num3[num3.length/2];
        

        }    
        }
      
    }

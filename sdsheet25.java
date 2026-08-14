 class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
      int ts=0;
      int xor=0;
      for(int i=0;i<nums.length;i++){
        xor=0;
        for(int j=i;j<nums.length;j++){
           
            xor=xor^nums[j];
            if(xor==k){
                ts++;
            }
            }
      } 
            return ts;
        


       
    }
}

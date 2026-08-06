class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
       Set<Integer> set1 = new HashSet<>();

         for(int x:nums1){
             set1.add(x);
         }
         for(int x:nums2){
             set1.add(x);
         }
         int nums[]= new int[set1.size()];
         int i=0;
         for(int x:set1){
            nums[i++]=x;
         }
       return nums;
    }
}
    

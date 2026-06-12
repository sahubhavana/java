class Solution {
    public int maxProduct(int[] nums) {
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
    return fpro;
}
}

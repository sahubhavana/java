class Solution {
    public boolean solve(int[] nums,int index){
        if(index==nums.length-1){
            return true;
        }
        if(index==nums.length){
            return false;
        }
        
        boolean x=false;
        int jumpv=nums[index];
        for(int jump=1;jump<=jumpv;jump++){
            boolean a=solve(nums,index+jump);
                x=a||x;
        }
        return x;
    } 
    public boolean canJump(int[] nums) {
        boolean ans=solve(nums,0);
        return ans;
    }
}

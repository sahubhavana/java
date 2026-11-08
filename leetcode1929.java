class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int j=n;
        int ans[]=new int[(n+n)];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[j]=nums[i];
            j++;
        }
        return ans;
    }
}

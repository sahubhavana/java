class Solution {
    public boolean isPalindrome(int x) {
        int ans=x;
        int s=0;
        boolean result=false;
        while(x>0){
          s = s * 10 + (x % 10);
            x=x/10;
        }
        if(s==ans){
            return true;
        }
        return false;
    }
}

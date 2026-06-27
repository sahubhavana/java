class Solution {   
    public boolean palindromeCheck(String s) {
        //your code goes here
        return check(s,0,s.length()-1);
        
    }
    public static boolean check(String s,int left,int right){
        if(left==s.length()/2){
            return true;
        }
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
       return check(s,left+1,right-1);
    }
}

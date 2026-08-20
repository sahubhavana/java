class Solution {   
    public boolean rotateString(String s, String goal) {
        boolean x;
        if(s.length()!=goal.length()) return false;
        String str;
        str=s+s;
        x=str.contains(goal) ;
        return x;
        
    }
}

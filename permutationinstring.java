class Solution {
    public boolean checkInclusion(String s1, String s2) {
        String s="";
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s1.length();j++){
            if(i!=j){
                s=""+s1.charAt(i)+s1.charAt(j);
                if(s2.contains(s)){
                    return true;
                
                }
            }
                s="";
            
        }
        }
        return false;
        
    }
}

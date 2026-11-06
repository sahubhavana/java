class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<strs[0].length()){
            char x=strs[0].charAt(i);
            boolean a=true;
        for(int j=1;j<strs.length;j++){
            
              if(i >= strs[j].length() || strs[j].charAt(i) != x){
                a=false;
                break;
              }
        }
        if(a==true){
        ans.append(strs[0].charAt(i));
        }
        else{
            break;
        }
        i++;
    }
    return ans.toString();
    }
}

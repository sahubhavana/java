class Solution {
    public int compress(char[] chars) {
        int count=0;
        int k=0;
        String s="";
        int i=0;
        while(i<chars.length){
            char c=chars[i];
            count=0;
            while(i<chars.length && c==chars[i]){
                i++;
                count++;
            }
            
            chars[k]=c;
            k++;
            if(count>1){
                s=String.valueOf(count);
                for(char digit:s.toCharArray()){
                    chars[k]=digit;
                    k++;
                }
            }
        }
        return k;
    }
}

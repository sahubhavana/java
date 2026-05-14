class Solution {  
    public boolean anagramStrings(String s, String t) {
        int [] arr=new int[26];
        boolean ch=true;
      
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;   // increment
            arr[t.charAt(i) - 'a']--;   //
          
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
               ch=false;
            }
        }
     return ch;
    }
}

class Solution {
    public String reverseWords(String s) {
        
        String[] x = s.trim().split("\\s+");
        int j=x.length-1;
        for(int i=0;i<x.length/2;i++){
            String temp=x[i];
            x[i]=x[j];
            x[j]=temp;
            j--;
        }
        String str = String.join(" ", x);
        return str;
}
}

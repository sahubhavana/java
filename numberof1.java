class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int x=binary.length();
        int count=0;
        for(int i=0;i<x;i++){
            if(binary.charAt(i)=='1'){
                count=count+1;
            }
        }
      return count;
    }
}

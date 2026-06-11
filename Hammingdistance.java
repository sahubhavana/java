class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        int n=x^y;
       String binary= Integer.toBinaryString((n));
        count=Integer.bitCount(n);
       
        return count;
    }
}

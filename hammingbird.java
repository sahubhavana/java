class Solution {
    public int hammingDistance(int x, int y) {
        int bit=x^y;
        int count=0;
        while(bit!=0){
            bit=bit&(bit-1);
            count++;
        }
        return count;
    }
}

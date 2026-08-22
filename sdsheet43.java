class Solution {
    static long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        return (int)count(0,n);
    }
    public static long count(int idx,long n){
        if(idx==n){
            return 1;
        }
        long choices = (idx % 2 == 0) ? 5 : 4;
       
        return (choices * count(idx + 1, n)) % MOD;
    }
}

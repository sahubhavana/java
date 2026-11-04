import java.math.BigInteger;
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if((str1+str2)!=(str2+str1)){
            return "";
        }
      
        int x=str1.length();
        int y=str2.length();
        int ans = BigInteger.valueOf(x)
                    .gcd(BigInteger.valueOf(y))
                    .intValue();  
        return str1.substring(0,ans);
    }
}

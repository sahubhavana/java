3.to count number of subset or string
public static int substr(String s,int i,int[] dp){
        if(i==s.length()) return 1;
        if(dp[i]!=-1){
            return dp[i];
        }
        int x=substr(s,i+1,dp);
        int y=substr(s,i+1,dp);
        dp[i]=x+y;
        return dp[i];
}

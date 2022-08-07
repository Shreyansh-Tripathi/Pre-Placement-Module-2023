class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,0);
        
        return getWays(n,dp);
    }
    
    public int getWays(int n, int dp[]){
        if(n<=2) return n;
        
        if(dp[n]!=0) return dp[n];
        dp[n]=getWays(n-1,dp)+getWays(n-2,dp);
        return dp[n];
    }
}

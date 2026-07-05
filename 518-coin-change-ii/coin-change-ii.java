class Solution {
    public int change(int amount, int[] coins) {
        int N=coins.length;
        int[][] dp=new int[N][amount+1];

        for(int t=0;t<=amount;t++){
            if(t%coins[0]==0){
                dp[0][t]=1;
            }
        }
        for(int i=1;i<N;i++){
            for(int t=0;t<=amount;t++){
                int not_take=dp[i-1][t];
                int take=0;
                if(coins[i]<=t){
                    take=dp[i][t-coins[i]];
                }
                dp[i][t]=take+not_take;
            }
        }
        return dp[N-1][amount];
    }
}
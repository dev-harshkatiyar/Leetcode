class Solution {
    public int coinChange(int[] coins, int amount) {
        int N=coins.length;
        int[][] dp=new int[N][amount+1];

        for(int T=0;T<=amount;T++){
            if(T%coins[0]==0){
                dp[0][T]=T/coins[0];
            }else{
                dp[0][T]=(int)1e9;
            }
        }
        for(int i=1;i<N;i++){
            for(int T=0;T<=amount;T++){
                int not_take=0+dp[i-1][T];
                int take=Integer.MAX_VALUE;
                if(coins[i]<=T){
                    take=1+dp[i][T-coins[i]];
                }
                dp[i][T]=Math.min(take,not_take);
            }
        }
        int ans=dp[N-1][amount];
        if(ans>=1e9) return -1;
        return ans;
    }
}
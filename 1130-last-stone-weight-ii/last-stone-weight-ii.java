class Solution {
    public int stoneWeight(int[] stones){
        int totalsum=0;
        int n=stones.length;
        for(int i=0;i<n;i++){
            totalsum+=stones[i];
        }
        int k=totalsum/2;
        boolean[][] dp=new boolean[n][k+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(stones[0]<=k){
            dp[0][stones[0]]=true;
        }
        for(int i=1;i<n;i++){
            for(int tar=1;tar<=k;tar++){
                boolean not_take=dp[i-1][tar];
                boolean take=false;
                if(stones[i]<=tar){
                    take=dp[i-1][tar-stones[i]];
                }
                dp[i][tar]=take || not_take;
            }
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<=k;i++){
            if(dp[n-1][i]){
                int s1=i;
                int s2=totalsum-i;
                mini=Math.min(mini,Math.abs(s1-s2));
            }
        }
        return mini;
    }
    public int lastStoneWeightII(int[] stones) {
        return stoneWeight(stones);
    }
}
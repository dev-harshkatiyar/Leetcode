class Solution {
    public static int Count_expressions(int[] nums,int target){
        int n=nums.length;
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        int T=(target+totalsum)/2;
        if((target+totalsum)%2!=0 || Math.abs(target)>totalsum) return 0;
        int[][] dp=new int[n][T+1];
        if(nums[0]==0) dp[0][0]=2;
        else dp[0][0]=1;
        if(nums[0]!=0 && nums[0]<=T) dp[0][nums[0]]=1;

        for(int i=1;i<n;i++){
            for(int t=0;t<=T;t++){
                int not_take=0+dp[i-1][t];
                int take=0;
                if(nums[i]<=t){
                    take=dp[i-1][t-nums[i]];
                }
                dp[i][t]=take+not_take;
            }
        }
        return dp[n-1][T];
    }
    public int findTargetSumWays(int[] nums, int target) {
        return Count_expressions(nums,target);
    }
}
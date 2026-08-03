class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        // int[][] dp=new int[n+1][n+1];

        // for(int ind=n-1;ind>=0;ind--){
        //     for(int prev_ind=ind-1;prev_ind>=-1;prev_ind--){
        //         int len=0+dp[ind+1][prev_ind+1];
        //         if(prev_ind==-1 || nums[ind]>nums[prev_ind]){
        //             len=Math.max(len,1+dp[ind+1][ind+1]);
        //         }
        //         dp[ind][prev_ind+1]=len;
        //     }
        // }
        // return dp[0][0];
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(1+dp[j],dp[i]);
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
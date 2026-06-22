class Solution {
    public static boolean subsetSum(int[] nums,int n,int k){
        boolean[][] dp=new boolean[n][k+1]; 
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(nums[0]<=k){
            dp[0][nums[0]]=true;
        }
        for(int ind=1;ind<n;ind++){
            for(int target=1;target<=k;target++){
                boolean not_take=dp[ind-1][target];
                boolean take=false;
                if(target>=nums[ind]){
                    take=dp[ind-1][target-nums[ind]];
                }
                dp[ind][target]=take||not_take;
            }
        }
        return dp[n-1][k];
    }
    public boolean canPartition(int[] nums) {
        int totalsum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        if(totalsum%2!=0) return false;
        int k=totalsum/2;
        return subsetSum(nums,n,k);
    }
}
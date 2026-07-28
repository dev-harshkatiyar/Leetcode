class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n+2];
        arr[0]=1;
        for(int i=0;i<n;i++){
            arr[i+1]=nums[i];
        }
        arr[n+1]=1;
        int c=arr.length-2;
        int[][] dp=new int[c+2][c+2];
        for(int i=c;i>=1;i--){
            for(int j=1;j<=c;j++){
                if(i>j) continue;
                int max=Integer.MIN_VALUE;
                for(int ind=i;ind<=j;ind++){
                    int cost=(arr[i-1]*arr[ind]*arr[j+1])+dp[i][ind-1]+dp[ind+1][j];
                    max=Math.max(max,cost);
                }
                dp[i][j]=max;
            }
        }
        return dp[1][c];
    }
}
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];

        for(int j=0;j<n;j++){
            dp[0][j]=matrix[0][j];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int up=Integer.MAX_VALUE,ld=Integer.MAX_VALUE,rd=Integer.MAX_VALUE;
                up=matrix[i][j]+dp[i-1][j];
                if(j-1>=0)
                    ld=matrix[i][j]+dp[i-1][j-1];
                if(j+1<m)    
                    rd=matrix[i][j]+dp[i-1][j+1];
                dp[i][j]=Math.min(up,Math.min(ld,rd));
            }
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            min=Math.min(min,dp[n-1][j]);
        }
        return min;
    }
}
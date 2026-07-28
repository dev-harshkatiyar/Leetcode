class Solution {
    public int minCost(int n, int[] cuts) {
        int N=cuts.length;
        int[] arr=new int[N+2];
        arr[0]=0;
        for(int i=0;i<N;i++){
            arr[i+1]=cuts[i];
        }
        arr[N+1]=n;
        Arrays.sort(arr);
        int c=arr.length-2;
        int[][] dp=new int[c+2][c+2];
        for(int i=c;i>=1;i--){
            for(int j=1;j<=c;j++){
                if(i>j) continue;
                int min=Integer.MAX_VALUE;
                for(int ind=i;ind<=j;ind++){
                    int cost=arr[j+1]-arr[i-1]+dp[i][ind-1]+dp[ind+1][j];
                    min=Math.min(min,cost);
                }
                dp[i][j]=min;
            }
        }
        return dp[1][c];
    }
}
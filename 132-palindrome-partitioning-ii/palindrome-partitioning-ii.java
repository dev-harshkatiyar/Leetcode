class Solution {
    boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int minCut(String s) {
        int n=s.length();
        int[] dp=new int[n+1];
        dp[n]=0;

        for(int i=n-1;i>=0;i--){
            int min_cost=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    int cost=1+dp[j+1];
                    min_cost=Math.min(min_cost,cost);
                }
            }
            dp[i]=min_cost;
        }
        return dp[0]-1;
    }
}
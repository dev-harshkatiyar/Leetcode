class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int[] prev=new int[n];
        Arrays.fill(prev,-1);
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    prev[i]=j;
                }
            }
        }
        int maxLen=0;
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(dp[i]>maxLen){
                maxLen=dp[i];
                maxIndex=i;
            }
        }
        List<Integer> listseq=new ArrayList<>();
        int curr=maxIndex;
        while(curr!=-1){
            listseq.add(nums[curr]);
            curr=prev[curr];
        }
        Collections.reverse(listseq);
        return listseq;
    }
}
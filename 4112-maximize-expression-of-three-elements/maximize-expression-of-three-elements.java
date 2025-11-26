class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int a=0,b=0,c=0;
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a=nums[n-1];
            b=nums[n-2];
            min=Math.min(min,nums[i]);
            c=min;
        }
        return a+b-c;
    }
}
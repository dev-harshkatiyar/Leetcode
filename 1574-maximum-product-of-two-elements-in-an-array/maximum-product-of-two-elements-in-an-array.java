class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int prod=1;
        int max1=0;
        int max2=0;
        for(int i=0;i<n;i++){
            max1=Math.max(max1,Math.min(max2,nums[i]));
            max2=Math.max(max2,nums[i]);
        }
        return (max1-1)*(max2-1);
    }
}
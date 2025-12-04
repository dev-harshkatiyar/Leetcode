class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return helper(nums,upper)-helper(nums,lower-1);
    }
    public long helper(int[] nums,int val){
        long ans=0;
        int left=0,right=nums.length-1;

        while(left<right){
            if(nums[left]+nums[right]<=val){
                ans+=right-left;
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}
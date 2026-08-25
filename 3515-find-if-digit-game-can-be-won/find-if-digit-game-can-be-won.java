class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int alice=0;
        int bob=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0 && nums[i]<=9){
                alice+=nums[i];
            }
            else if(nums[i]>=10 && nums[i]<=99){
                bob+=nums[i];
            }
        }
        return alice!=bob;
    }
}
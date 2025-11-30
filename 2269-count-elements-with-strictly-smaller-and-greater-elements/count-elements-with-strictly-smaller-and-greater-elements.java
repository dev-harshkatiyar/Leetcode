class Solution {
    public int countElements(int[] nums) {
        int count=0;
        int total=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        for(int x : nums){
            if(x>min && max>x){
                count++;
            }
        }
        return count;
    }
}
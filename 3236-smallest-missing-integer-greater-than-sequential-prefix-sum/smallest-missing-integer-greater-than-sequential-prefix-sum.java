class Solution {
    public int missingInteger(int[] nums) {
        int prefixsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1) break;
            prefixsum+=nums[i];
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int x=prefixsum;
        while(set.contains(x)){
            x++;
        }
        return x;
    }
}
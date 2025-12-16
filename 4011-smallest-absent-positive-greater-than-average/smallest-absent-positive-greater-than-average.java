class Solution {
    public int smallestAbsent(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        double avg=(double)sum/nums.length;
        int x=(int)Math.floor(avg)+1;
        for(int num:nums){
            set.add(num);
        }
        while(set.contains(x) || x<=0){
            x++;
        }
        return x;
    }
}
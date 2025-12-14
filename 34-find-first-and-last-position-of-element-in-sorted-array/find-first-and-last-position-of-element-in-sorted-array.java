class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        if(list.isEmpty()){
            return new int[]{-1,-1};
        }
        return new int[]{list.get(0),list.get(list.size()-1)};
    }
}
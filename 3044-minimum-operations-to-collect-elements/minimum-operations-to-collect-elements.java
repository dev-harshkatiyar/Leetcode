class Solution {
    public int minOperations(List<Integer> nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=nums.size()-1;i>=0;i--){
            count++;
            int x=nums.get(i);
            if(x<=k){
                set.add(x);
            }
            if(set.size()==k) break;
        }
        return count;
    }
}
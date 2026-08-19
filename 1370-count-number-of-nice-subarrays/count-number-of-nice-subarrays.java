class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefix_sum=0;
        int count=0;
        map.put(0,1);

        for(int num:nums){
            if(num%2==1){
                prefix_sum+=1;
            }
            if(map.containsKey(prefix_sum-k)){
                count+=map.get(prefix_sum-k);
            }
            map.put(prefix_sum,map.getOrDefault(prefix_sum,0)+1);
        }
        return count;
    }
}
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixsum=0;
        int count=0;
        map.put(0,1);

        for(int num:nums){
            if(num%2==1){
                prefixsum+=1;
            }
            if(map.containsKey(prefixsum-k)){
                count+=map.get(prefixsum-k);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}
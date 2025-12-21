class Solution {
    public int findLength(HashMap<Integer,Boolean> map,int k){
        int ans=0;
        while(map.containsKey(k)){
            ans++;
            k++;
        }
        return ans;
    }
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],true);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
        }
        int max=0;
        for(int freq:map.keySet()){
            if(map.get(freq)==true){
                max=Math.max(max,findLength(map,freq));
            }
        }
        return max;
    }
}
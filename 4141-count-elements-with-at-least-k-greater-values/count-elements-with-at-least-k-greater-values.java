class Solution {
    public int countElements(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list,Collections.reverseOrder());

        int count=0, greater=0;
        for(int val:list){
            if(greater>=k) count+=map.get(val);
            greater+=map.get(val);
        }
        return count;
    }
}

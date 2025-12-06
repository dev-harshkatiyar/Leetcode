class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res=new int[nums.length];
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->{
            if(!a.getValue().equals(b.getValue()))
                return a.getValue()-b.getValue();
            return b.getKey()-a.getKey();
        });
        int i=0;
        for(Map.Entry<Integer,Integer> entry:list){
            int val=entry.getValue();
            while(val>0){
                res[i]=entry.getKey();
                i++;
                val--;
            }
        }
        return res;
    }
}
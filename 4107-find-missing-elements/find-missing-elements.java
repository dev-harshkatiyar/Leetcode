class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int num:nums){
            map.add(num);
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        for(int i=min;i<=max;i++){
            if(!map.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
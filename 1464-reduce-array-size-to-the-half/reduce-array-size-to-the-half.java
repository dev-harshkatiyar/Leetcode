class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list=new ArrayList<>(map.values());
        Collections.sort(list,Collections.reverseOrder());
        int count=0;
        int removed=0;
        int half=arr.length/2;
        for(int freq:list){
            removed+=freq;
            count++;
            if(removed>=half){
                break;
            }
        }
        return count;
    }
}
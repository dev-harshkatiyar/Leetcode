class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] res=new int[arr1.length];
        int idx=0;
        for(int x:arr2){
            int freq=map.get(x);
            for(int i=0;i<freq;i++){
                res[idx++]=x;
            }
            map.put(x,0);
        }
        List<Integer> remaining=new ArrayList<>();
        for(int key:map.keySet()){
            int freq=map.get(key);
            for(int i=0;i<freq;i++){
                remaining.add(key);
            }
        }
        Collections.sort(remaining);
        for(int num:remaining){
            res[idx++]=num;
        }
        return res;
    }
}
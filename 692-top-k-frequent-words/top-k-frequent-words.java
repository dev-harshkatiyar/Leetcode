class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String ch:words){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        List<String> res=new ArrayList<>();
        Collections.sort(list,(a,b)->{
            if(!a.getValue().equals(b.getValue()))
                return b.getValue()-a.getValue();
            return a.getKey().compareTo(b.getKey());    
        });
        for(int i=0;i<k;i++){
            res.add(list.get(i).getKey());    
        }
        return res;




    }
}
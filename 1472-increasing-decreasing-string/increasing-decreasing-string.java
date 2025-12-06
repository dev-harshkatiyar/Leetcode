class Solution {
    public String sortString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> keys=new ArrayList<>(map.keySet());
        Collections.sort(keys);

        int n=s.length();
        StringBuilder res=new StringBuilder();

        while(res.length()<n){
            for(char ch:keys){
                if(map.get(ch)>0){
                    res.append(ch);
                    map.put(ch,map.get(ch)-1);
                }
            }
            for(int i=keys.size()-1;i>=0;i--){
                char ch=keys.get(i);
                if(map.get(ch)>0){
                    res.append(ch);
                    map.put(ch,map.get(ch)-1);
                }
            }
        }
        return res.toString();
    }
}
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            end=Math.max(end,map.get(ch));
            if(i==end){
                res.add(end-start+1);
                start=i+1;
            }
        }
        return res;
    }
}
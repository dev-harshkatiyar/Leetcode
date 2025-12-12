class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> sCount=new HashMap<>();
        for(char ch:s.toCharArray()){
            sCount.put(ch,sCount.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> tCount=new HashMap<>();
        for(char ch:target.toCharArray()){
            tCount.put(ch,tCount.getOrDefault(ch,0)+1);
        }
        int copy=Integer.MAX_VALUE;
        for(char ch:target.toCharArray()){
            int available=sCount.getOrDefault(ch,0);
            int needed=tCount.getOrDefault(ch,0);
            copy=Math.min(available/needed,copy);
        }
        return copy;
    }
}
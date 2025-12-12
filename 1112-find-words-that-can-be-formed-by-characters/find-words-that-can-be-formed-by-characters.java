class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:chars.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int total=0;
        for(String s:words){
            HashMap<Character,Integer> temp=new HashMap<>(map);
            boolean check=true;
            for(char ch:s.toCharArray()){
                int count=temp.getOrDefault(ch,0);
                if(count==0){
                    check=false;
                    break;
                }
                temp.put(ch,count-1);
            }
            if(check)
                total+=s.length();
        }
        return total;
    }
}
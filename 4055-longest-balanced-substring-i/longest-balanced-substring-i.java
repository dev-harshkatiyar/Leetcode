class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int maxlen=0;

        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);

                if(checkBalance(map)){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }
     public boolean checkBalance(HashMap<Character,Integer> map){
        int value=0;
        for(int freq:map.values()){
            if(value==0){
                value=freq;
            }
            else if(value!=freq){
                return false;
            }
        }
        return true;
    }
}
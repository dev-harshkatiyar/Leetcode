class Solution {
    public int countGoodSubstrings(String s) {
        int w=3;
        int res=0;
        for(int i=0;i<=s.length()-w;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<w;j++){
                char ch=s.charAt(i+j);
                if(!set.contains(ch)){
                    set.add(ch);
                }
            }
            if(set.size()==3){
                res++;
            }
        }
        return res;
    }
}
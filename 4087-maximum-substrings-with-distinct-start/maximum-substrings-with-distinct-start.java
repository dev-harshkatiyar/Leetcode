class Solution {
    public int maxDistinct(String s) {
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                count++;
            }
        }
        return count;
    }
}
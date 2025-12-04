class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> set=new HashSet<>();
        for(String s:bannedWords){
            set.add(s);
        }
        int count=0;
        for(String st:message){
            if(set.contains(st)){
                count++;
            }
            if(count==2) return true;
        }
        return false;
    }
}
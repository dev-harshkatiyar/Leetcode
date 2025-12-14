class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int barcount=0;
        for(char ch:s.toCharArray()){
            if(ch=='|'){
                barcount++;
            }else if(ch=='*' && barcount%2==0){
                count++;
            }
        }
        return count;
    }
}
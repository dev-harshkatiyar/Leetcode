class Solution {
    public int countAsterisks(String s) {
        int count=0;
        boolean insidebars=false;
        for(char ch:s.toCharArray()){
            if(ch=='|'){
                insidebars=!insidebars;
            }else if(ch=='*' && !insidebars){
                count++;
            }
        }
        return count;
    }
}
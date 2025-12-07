class Solution {
    public int countOdds(int low, int high) {
        int countodds=0;
        if(low%2==0 && high%2==0){
            countodds=(high-low)/2;
        }else{
            countodds=(high-low)/2+1;
        }
        return countodds;
    }
}
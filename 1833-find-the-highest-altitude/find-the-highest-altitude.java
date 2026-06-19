class Solution {
    public int largestAltitude(int[] gain) {
        int altitude=0;
        int highAltitude=0;
        for(int g:gain){
            altitude+=g;
            highAltitude=Math.max(highAltitude,altitude);
        }
        return highAltitude;
    }
}
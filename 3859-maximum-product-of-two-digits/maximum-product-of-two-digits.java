class Solution {
    public int maxProduct(int n) {
        int max=0;
        int secondmax=0;

        while(n>0){
            int digit=n%10;
            secondmax=Math.max(secondmax,Math.min(max,digit));
            max=Math.max(max,digit);
            n=n/10;
        }
        return max*secondmax;
    }
}
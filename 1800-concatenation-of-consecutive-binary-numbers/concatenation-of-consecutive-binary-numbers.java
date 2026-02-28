class Solution {
    public int concatenatedBinary(int n) {
        int mod=1_000_000_007;
        long ans=0,shift=0;
        for(int i=1;i<=n;i++){
            if(Integer.bitCount(i)==1){
                shift++;
            }
            ans=((ans<<shift)+i)%mod;
        }
        return (int)ans;
    }
}
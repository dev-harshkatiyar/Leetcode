class Solution {
    boolean checkPossible(String s1,String s2){
        if(s1.length()!=s2.length()+1) return false;
        int i=0;
        int j=0;
        while(i<s1.length()){
            if(j<s2.length() && s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return (i==s1.length() && j==s2.length());
    }
    public int longestStrChain(String[] words) {
        int n=words.length;
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int maxlen=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(checkPossible(words[i],words[j]) && dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                }
            }
            if(dp[i]>maxlen){
                maxlen=dp[i];
            }
        }
        return maxlen;
    }
}
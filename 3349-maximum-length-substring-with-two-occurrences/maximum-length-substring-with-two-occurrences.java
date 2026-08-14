class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int[] freq=new int[26];
        int left=0;
        int maxLen=0;

        for(int right=0;right<n;right++){
            int index=s.charAt(right)-'a';
            freq[index]++;

            while(freq[index]>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
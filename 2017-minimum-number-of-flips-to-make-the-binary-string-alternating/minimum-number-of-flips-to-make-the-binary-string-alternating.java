class Solution {
    public int minFlips(String s) {
        int onestart = 0, zerostart = 0;

        String str = s + s;
        int n = s.length();
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < 2 * n; i++) {

            char ch = str.charAt(i);

            if(i % 2 == 0){
                if(ch == '0'){
                    onestart++;
                }else{
                    zerostart++;
                }
            } else {
                if(ch == '0'){
                    zerostart++;
                }else{
                    onestart++;
                }
            }
            if(i >= n - 1){
                ans = Math.min(ans, Math.min(onestart, zerostart));
                int prev = i - n + 1;
                char prv = str.charAt(prev);

                if(prev % 2 == 0){
                    if(prv == '0'){
                        onestart--;
                    }else{
                        zerostart--;
                    }
                } else {
                    if(prv == '0'){
                        zerostart--;
                    }else{
                        onestart--;
                    }
                }
            }
        }
        return ans;
    }
}
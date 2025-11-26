class Solution {
    public long removeZeros(long n) {
        String s=Long.toString(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='0'){
                sb.append(ch);
            }
        }
        return Long.parseLong(sb.toString());
    }
}
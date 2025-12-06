class Solution {
    public boolean isSubsequence(String s,String d){
        int i=0,j=0;
        while(i<s.length() && j<d.length()){
            if(s.charAt(i)==d.charAt(j)) j++;
            i++;
        }
        return j==d.length();
    }
    public String findLongestWord(String s, List<String> dictionary) {
        String res="";
        for(String str:dictionary){
             if (isSubsequence(s, str)) {
                if (str.length() > res.length() || 
                   (str.length() == res.length() && str.compareTo(res) < 0)) {
                    res = str;
            }
        }
    }
     return res;
}
}
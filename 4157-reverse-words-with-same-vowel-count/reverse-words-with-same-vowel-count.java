class Solution {
    public int countVowel(String word){
        int count=0;
        for(char ch:word.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }
    public String reverseWords(String s) {
        String[] word=s.split(" ");
        int baseVowels=countVowel(word[0]);

        for(int i=1;i<word.length;i++){
            if(countVowel(word[i])==baseVowels){
                word[i]=new StringBuilder(word[i]).reverse().toString();
            }
        }
        return String.join(" ",word);
    }
}
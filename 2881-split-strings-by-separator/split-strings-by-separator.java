class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.size();i++){
            String[] wordarr=words.get(i).split("["+separator+"]");
            for(String word:wordarr){
                if(word!=""){
                    res.add(word);
                }
            }
        }
        return res;
    }
}
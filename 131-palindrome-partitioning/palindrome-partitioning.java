class Solution {
    void func(int index,String s,List<List<String>> result,List<String> path){
        if(index==s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                func(i+1,s,result,path);
                path.remove(path.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        List<String> path=new ArrayList<>();
        func(0,s,result,path);
        return result;
    }
}
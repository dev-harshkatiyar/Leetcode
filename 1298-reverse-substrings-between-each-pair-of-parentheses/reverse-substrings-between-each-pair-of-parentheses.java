class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch!=')'){
                st.push(ch);
            }else{
                StringBuilder sb=new StringBuilder();
                while(!st.isEmpty() && st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
                for(char c:sb.toString().toCharArray()){
                    st.push(c);
                }
            }
        }        
        StringBuilder res=new StringBuilder();
        for(char ch:st){
            res.append(ch);
        }
        return res.toString();
    }
}
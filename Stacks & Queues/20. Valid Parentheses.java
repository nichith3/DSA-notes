class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            // if opening brackets then push to stack
            if(c=='(' || c=='[' || c=='{') st.push(c);

            // if its closing bracket then pop top of stack and
            // check it has corresponding opening bracket or not
            else{
                if(st.isEmpty()) return false;
                char ch=st.pop();
                if((c==')' && ch=='(') || (c==']' && ch=='[') || (c=='}' && ch=='{')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}

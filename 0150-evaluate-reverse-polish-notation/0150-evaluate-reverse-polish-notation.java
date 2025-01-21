class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length,n1=0,n2=0;
        Stack<Integer> st=new Stack();
        for(int i=0;i<n;i++){
            String a=tokens[i];
            if(a.equals("+")||a.equals("-")||a.equals("/")||a.equals("*")){
                n1=st.pop();
                n2=st.pop();
                if(a.equals("+"))st.push(n1+n2);
                else if(a.equals("-"))st.push(n2-n1);
                else if(a.equals("/")){
                    if(n1==0 || n2==0)st.push(0);
                    else st.push(n2/n1);
                }
                else st.push(n1*n2);
            }
            else st.push(Integer.valueOf(tokens[i]));
        }
        return st.peek();
    }
}
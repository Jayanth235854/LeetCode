class Solution {
    public List<Integer> diffWaysToCompute(String exp) {
        int n=exp.length();
        List<Integer> ans=new ArrayList();
        for(int i=0;i<n;i++){
            if(exp.charAt(i)=='-' || exp.charAt(i)=='*' || exp.charAt(i)=='+'){
                List<Integer> d1 = diffWaysToCompute(exp.substring(0,i));
                List<Integer> d2 = diffWaysToCompute(exp.substring(i+1));
                for(int a:d1){
                    for(int b:d2){
                        if(exp.charAt(i)=='+') ans.add(a+b);
                        else if(exp.charAt(i)=='-') ans.add(a-b);
                        else ans.add(a*b);
                    }
                }
            }
        }
        if(ans.size()==0) ans.add(Integer.valueOf(exp));
        return ans;
    }
}
class Solution {
    public int numSteps(String s) {
        int n=Integer.parseInt(s,2);
        int count=0;
        while(n!=1){
            count++;
            if(n%2==0)n/=2;
            else n++;
        }
        return count;
    }
}
class Solution {
    public int bestClosingTime(String customers) {
        int min=0,n=customers.length(),sum=0;
        for(char ch:customers.toCharArray()){
            if(ch=='Y') sum++;
        }
        int prev=sum;
        for(int i=0;i<n;i++){
            char ch=customers.charAt(i);
            if(ch=='Y') sum--;
            else sum++;
            if(sum<prev){
                min=i+1;
                prev=sum;
            }
        }
        return min;
    }
}
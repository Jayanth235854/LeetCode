class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String n=Integer.toString(i);
            if(n.length()%2==0){
                int sum=0,half=0,l=i;
                for(int j=0;j<n.length();j++){
                    sum+=l%10;
                    l/=10;
                    if(j==(n.length()/2)-1)half=sum;
                }
                if(half==sum-half)count++;
            }else continue;
        }
        return count;
    }
}
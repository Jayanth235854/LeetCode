class Solution {
    public int numberOfChild(int n, int k) {
        int a=0;
        int ans=right(a,n,k);
        return ans;
    }
    public int right(int a,int n,int k){
        if(k==0)return a;
        while(a!=n-1 && k!=0){
            a++;
            k--;
        }
        if(k!=0)a=left(a,n,k);
        return a;
    }
    public int left(int a,int n,int k){
        if(k==0)return a;
        while(a!=0 && k!=0){
            a--;
            k--;
        }
        if(k!=0)a=right(a,n,k);
        return a;
    }
}
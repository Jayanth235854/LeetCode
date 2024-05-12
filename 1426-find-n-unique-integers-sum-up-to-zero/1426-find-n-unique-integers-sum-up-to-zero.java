class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        if(n%2==0){
            int count=1;
            for(int i=0;i<n;i++){
                if(i%2==1){
                    arr[i]=-count;
                    count++;
                }else arr[i]=count;
            }
        }else{
            int count=1;
            for(int i=0;i<n-1;i++){
                if(i%2==1){
                    arr[i]=-count;
                    count++;
                }else arr[i]=count;
            }
            arr[n-1]=0;
        }
        return arr;
    }
}
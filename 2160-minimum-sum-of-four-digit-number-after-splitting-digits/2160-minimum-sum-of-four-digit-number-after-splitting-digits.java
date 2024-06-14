class Solution {
    public int minimumSum(int num) {
        int n=num;
        int a=n%10;
        n/=10;
        int b=n%10;
        n/=10;
        int c=n%10;
        n/=10;
        int d=n;
        int[] arr=new int[4];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        Arrays.sort(arr);
        int sum=arr[0]*10+arr[1]*10+arr[2]+arr[3];
        return sum;
    }
}
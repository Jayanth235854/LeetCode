class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length,even=0;
        int odd=n/2;
        if(n%2==0) even=n/2;
        else even=(n/2)+1;
        int[] odar =new int[odd];
        int[] evar =new int[even];
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(i%2==0)evar[a++]=nums[i];
            else odar[b++]=nums[i];
        }
        Arrays.sort(odar);
        Arrays.sort(evar);
        for(int i=0,j=odd-1;i<j;i++,j--){
            int s=odar[i];
            odar[i]=odar[j];
            odar[j]=s;
        }
        a=0;
        b=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0) arr[i]=evar[a++];
            else arr[i]=odar[b++];
        }
        return arr;
    }
}
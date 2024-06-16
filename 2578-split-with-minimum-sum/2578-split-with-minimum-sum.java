class Solution {
    public int splitNum(int num) {
        int[] arr=new int[10];
        int i=0;
        while(num>0){
            arr[i++]=num%10;
            num/=10;
        }
        int[] ar=new int[i];
        for(int a=0;a<i;a++)ar[a]=arr[a];
        Arrays.sort(ar);
        int num1=0,num2=0;
        for(int j=0;j<i;j+=2){
            num1=num1*10 + ar[j];
            if(j+1<i) num2=num2*10 + ar[j+1];
        }
        return num1+num2;

    }
}
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> temp=new LinkedHashSet<>();
        int n=digits.length,z=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)continue;
                for(int k=0;k<n;k++){
                    if(i==k || j==k)continue;
                    int a=digits[i]*100+digits[j]*10+digits[k];
                    if(a<100)continue;
                    if(a%2==0)temp.add(a);
                }
            }
        }
        int[] arr=new int[temp.size()];
        for(int val:temp){
            arr[z++]=val;
        }
        Arrays.sort(arr);
        return arr;
    }
}
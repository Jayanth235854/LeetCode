class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)continue;
                for(int k=0;k<n;k++){
                    if(i==k || j==k || i==j)continue;
                    int a=digits[i]*100+digits[j]*10+digits[k];
                    if(a<100)continue;
                    if(a%2==0)ans.add(a);
                }
            }
        }
        Set<Integer> l=new LinkedHashSet<Integer>(ans);
        ArrayList<Integer> al=new ArrayList<>(l);
        int[] arr=new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        Arrays.sort(arr);
        return arr;
    }
}
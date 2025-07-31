class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        int n=arr.length;
        Set<Integer> unique=new HashSet<>(), prev=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> cur=new HashSet<>();
            cur.add(arr[i]);
            unique.add(arr[i]);
            for(Integer pre:prev){
                cur.add(arr[i]|pre);
                unique.add(arr[i]|pre);
            }
            prev=cur;
        }
        return unique.size();
    }
}
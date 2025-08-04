class Solution {
    public int totalFruit(int[] arr) {
        int max=2,n=arr.length,cur=0,ind=0;
        if(n<=2)return n;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            //System.out.print(set+"  ");
            if(set.size()<2)set.add(arr[i]);
            if(set.size()==2 && !(set.contains(arr[i]))){
                int j=i-1, num=arr[i-1];
                while(j>=0 && arr[j]==num)j--;
                ind=j+1;
                set.clear();
                set.add(num);set.add(arr[i]);
            }
            //System.out.println(set);
            cur=i-ind+1;
            max=Math.max(cur,max);
        }
        return max;
    }
}
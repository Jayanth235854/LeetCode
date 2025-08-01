class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>(), tem=new ArrayList<>();;
        temp.add(1);
        ans.add(temp);
        if(num==1)return ans;
        tem.add(1);tem.add(1);
        ans.add(tem);
        if(num==2)return ans;
        while(ans.size()!=num){
            int n=ans.size();
            List<Integer> cur=new ArrayList<>();
            List<Integer> prev=ans.get(n-1);
            cur.add(1);
            for(int i=1;i<n;i++){
                int sum=prev.get(i-1)+prev.get(i);
                cur.add(sum);
            }
            cur.add(1);
            ans.add(cur);

        }
        return ans;
    }
}
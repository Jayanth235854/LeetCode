class Solution {
    public long findScore(int[] nums) {
        int n=nums.length,ans=0;
        List<Integer> a=new ArrayList();
        List<Integer> b=new ArrayList();
        for(int i=0;i<n;i++){
            a.add(nums[i]);
            b.add(nums[i]);
        }
        Collections.sort(b);
        while(b.size()!=0){
            for(int i=0;i<a.size();i++){
                if(a.get(i)==b.get(0)){
                    ans+=a.get(i);
                    int cur=i;
                    if(i<a.size()-1){
                        b.remove(Integer.valueOf(a.get(i+1)));
                        a.remove(i+1);
                    }
                    if(i>0){
                        b.remove(Integer.valueOf(a.get(i-1)));
                        a.remove(i-1);
                        cur=i-1;
                    }
                    a.remove(cur);
                    b.remove(0);
                }
            }
        }
        return ans;
    }
}
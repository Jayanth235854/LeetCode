class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=s.length(),a=0,b=0,l=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                b=i;
                l=b-a+1;
                if(l>2){
                    List<Integer> ad=new ArrayList<>();
                    ad.add(a);
                    ad.add(b);
                    ans.add(ad);
                }
                a=i+1;
            }
        }
        l=n-a;
        if(l>2){
            List<Integer> ad=new ArrayList<>();
            ad.add(a);
            ad.add(n-1);
            ans.add(ad);
        }
        return ans;
    }
}
class Solution {
    public int maximumLength(String s) {
        HashMap<Character,Integer> hm=new HashMap();
        int max=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry m:hm.entrySet()){
            int ans=0;
            int k=(int)(m.getValue());
            if(k>=3)ans=k-2;
            if(ans>max)max=ans;
        }
        if(max>0)return max;
        return -1;
    }
}
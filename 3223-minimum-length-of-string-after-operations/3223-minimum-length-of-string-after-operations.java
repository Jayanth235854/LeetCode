class Solution {
    public int minimumLength(String s) {
        int n=s.length(),ans=0;
        Map<Character,Integer> hm=new HashMap();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(Map.Entry m: hm.entrySet()){
            int i=(int)(m.getValue());
            if(i>=3){
                if(i%2==0)ans+=2;
                else ans++;
            }else{
                ans+=i;
            }
        }
        return ans;
    }
}
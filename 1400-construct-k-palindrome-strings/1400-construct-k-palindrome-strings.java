class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length(),oddCount=0;
        if(n<k)return false;
        Map<Character,Integer> hm=new HashMap();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> it:hm.entrySet()){
            if(it.getValue()%2!=0) oddCount++;
        }
        if(oddCount>k) return false;
        return true;
    }
}
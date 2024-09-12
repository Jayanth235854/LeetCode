class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> dup=new HashSet();
        int ans=0;
        for(char a:allowed.toCharArray())dup.add(a);
        for(String a:words){
            boolean present=true;
            for(char ch:a.toCharArray()){
                if(!dup.contains(ch)){
                    present=false;
                    break;
                }
            }
            if(present) ans++;
        }
        return ans;
    }
}
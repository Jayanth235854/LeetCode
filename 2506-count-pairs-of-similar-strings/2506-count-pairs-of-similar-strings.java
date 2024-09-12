class Solution {
    public int similarPairs(String[] words) {
        int n=words.length, ans=0;
        List<Set<Character>> unique=new ArrayList();
        for(String word:words){
            Set<Character> a=new HashSet();
            for(char ch:word.toCharArray())a.add(ch);
            unique.add(a);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(unique.get(i).containsAll(unique.get(j)) && unique.get(j).containsAll(unique.get(i)))ans++;
            }
        }
        return ans;
    }
}
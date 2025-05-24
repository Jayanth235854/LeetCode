class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> temp=new ArrayList<>();
        String a=Character.toString(x);
        for(int i=0;i<words.length;i++){
            if(words[i].contains(a)) temp.add(i);
        }
        return temp;
    }
}
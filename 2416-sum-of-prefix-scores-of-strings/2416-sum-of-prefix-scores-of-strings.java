class Solution {
    public int[] sumPrefixScores(String[] words) {
        int n=words.length;
        int[] arr=new int[n];
        HashMap<String,Integer> map=new HashMap();
        for(int i=0;i<n;i++){
            String a="";
            for(char ch:words[i].toCharArray()){
                a+=ch;
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }
        for(int i=0;i<n;i++){
            String a="";
            int count=0;
            for(char ch:words[i].toCharArray()){
                a+=ch;
                count+=map.get(a);
            }
            arr[i]=count;
        }
        return arr;
    }
}
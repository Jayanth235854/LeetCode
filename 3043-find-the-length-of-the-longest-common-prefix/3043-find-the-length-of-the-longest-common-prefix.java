class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int max=0;
        HashMap<String,Integer> map=new HashMap();
        for(int arr:arr1){
            String pre="", a=String.valueOf(arr);
            for(char ch:a.toCharArray()){
                pre+=ch;
                map.put(pre,map.getOrDefault(pre,0)+1);
            }
        }
        for(int arr:arr2){
            String a=String.valueOf(arr), pre="";
            for(char ch:a.toCharArray()){
                pre+=ch;
                if(map.containsKey(pre)){
                    max=Math.max(max,pre.length());
                }
            }
        }
        return max;
    }
}
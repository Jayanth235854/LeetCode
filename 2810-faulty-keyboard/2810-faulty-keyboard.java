class Solution {
    public String finalString(String s) {
        String a="";
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='i')a+=arr[i];
            else{
                char[] arr1=a.toCharArray();
                for(int p=0,q=arr1.length-1;p<q;p++,q--){
                    char r=arr1[p];
                    arr1[p]=arr1[q];
                    arr1[q]=r;
                }
                a=new String(arr1);
            }
        }
        return a;
    }
}
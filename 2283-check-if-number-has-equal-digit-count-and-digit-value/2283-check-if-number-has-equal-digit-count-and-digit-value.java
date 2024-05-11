class Solution {
    public boolean digitCount(String num) {
        char[] arr=num.toCharArray();
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                int a=Character.getNumericValue(arr[j]);  
                if(a==i)count++;
            }
            int a=Character.getNumericValue(arr[i]);
            if(count!=a)return false;
        }
        return true;
    }
}
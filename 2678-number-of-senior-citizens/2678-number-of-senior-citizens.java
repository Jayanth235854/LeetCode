class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String k=details[i].substring(11);
            int l=Integer.valueOf(k);
            l/=100;
            if(l>60)count++;
        }
        return count;
    }
}
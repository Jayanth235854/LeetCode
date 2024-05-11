class Solution {
    public int minOperations(String[] logs) {
        int result=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                if(result>0)result--;
            }
            else if(!logs[i].equals("./"))result++;
        }
        return result;
    }
}
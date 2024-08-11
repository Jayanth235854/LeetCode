class Solution {
    public int fillCups(int[] amount) {
        int count =0;
        while(amount[0]>0 && amount[1]>0 && amount[2]>0){
            count++;
            int a=amount[0],b=amount[1],c=amount[2];
            if(a>=b && a>=c){
                amount[0]--;
                if(b>=c)amount[1]--;
                else amount[2]--;
            }else if(b>=a && b>=c){
                amount[1]--;
                if(a>=c)amount[0]--;
                else amount[2]--;
            }else{
                amount[2]--;
                if(a>=b)amount[0]--;
                else amount[1]--;
            }
        }
        if(amount[0]==0){
            int max=Math.max(amount[1],amount[2]);
            count+=max;
        }else if(amount[1]==0){
            int max=Math.max(amount[0],amount[2]);
            count+=max;
        }else{
            int max=Math.max(amount[0],amount[1]);
            count+=max;
        }
        return count;
    }
}
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,n=bills.length;
        for(int i=0;i<n;i++){
            if(bills[i]==5)five++;
            else if(bills[i]==10 && five>0){
                ten++;
                five--;
            }else if(bills[i]==20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five>2){
                    five-=3;
                }else return false;
            }
            else return false;
        }
        return true;
    }
}
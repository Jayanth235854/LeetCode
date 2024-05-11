class Solution {
    public int distMoney(int money, int children) {
        if(money<children)return -1;
        if(money<=8)return 0;
        int[] arr=new int[children];
        for(int i=0;i<children;i++){
            arr[i]=1;
            money--;
        }
        int count=0;
        for(int i=0;i<children;i++){
            if(money-7>=0){
                money-=7;
                count++;
            }
            else if(money>0){
                if(money==3 && i==arr.length-1)return --count;
                else money=0;
            }
        }
        if(money>0)count--;
        return count;
    }
}
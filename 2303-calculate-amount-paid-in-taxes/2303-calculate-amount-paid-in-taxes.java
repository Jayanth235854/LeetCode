class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double ans=0;
        int i=1;
        if(income>=brackets[0][0]) ans=((double)brackets[0][0]*brackets[0][1])/100;
        else {
            ans=((double)brackets[0][1]*income)/100;
            return ans;
        }
        System.out.print(ans);
        income-=brackets[0][0];
        while(income!=0){
            int money=brackets[i][0]-brackets[i-1][0];
            if(income>=money){
                ans=ans+((double)money*brackets[i][1])/100;
                income-=money;
            }else{
                ans=ans+((double)income*brackets[i][1])/100;
                income=0;
            }
            i++;
        }
        return ans;
    }
}
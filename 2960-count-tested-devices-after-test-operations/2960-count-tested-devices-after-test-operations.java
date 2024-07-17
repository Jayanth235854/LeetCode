class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count=0,n=batteryPercentages.length,c=0;
        for(int i=0;i<n;i++){
            batteryPercentages[i]-=c;
            if(batteryPercentages[i]>0){
                c++;
                count++;
            }
        }
        return count;
    }
}
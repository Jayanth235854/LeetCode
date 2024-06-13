class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n=boxTypes.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(boxTypes[i][1]<boxTypes[j][1]){
                    int a=boxTypes[i][0] , b=boxTypes[i][1];
                    boxTypes[i][0]=boxTypes[j][0];
                    boxTypes[i][1]=boxTypes[j][1];
                    boxTypes[j][0]=a;
                    boxTypes[j][1]=b;
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(truckSize>=boxTypes[i][0]){
                max=max+boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
            }
            else if(truckSize<boxTypes[i][0]){
                max=max+truckSize*boxTypes[i][1];
                break;
            }
        }
        return max;
    }
}
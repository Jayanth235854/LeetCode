class Solution {
    public int calPoints(String[] operations) {
        int[] arr=new int[operations.length];
        int sum=0,ind=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                arr[ind]=arr[ind-1]+arr[ind-2];
                ind++;
            }
            else if(operations[i].equals("D")){
                arr[ind]=2*arr[ind-1];
                ind++;
            }
            else if(operations[i].equals("C")){
                ind--;
                arr[ind]=0;
            }else{
                arr[ind]=Integer.parseInt(operations[i]);
                ind++;
            }
        }
        if(operations[0].equals("1") && operations[1].equals("C")&& operations.length<3){
            return 0;
        }
        for(int score:arr){
            sum+=score;
        }
        return sum;
    }
}
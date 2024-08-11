class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0,j=0,k=0,m=commands.size();
        while(m!=k){
            if(commands.get(k).equals("RIGHT"))j++;
            else if(commands.get(k).equals("LEFT"))j--;
            else if(commands.get(k).equals("UP"))i--;
            else i++;
            k++;
        }
        return (i*n)+j;
    }
}
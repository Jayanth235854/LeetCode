class Solution {
    public boolean squareIsWhite(String coordinates) {
        char[] ch=coordinates.toCharArray();
        if(ch[0]%2!=0){
            int n=Integer.valueOf(ch[1]);
            if(n%2==0)return true;
            else return false;
        }else{
            int n=Integer.valueOf(ch[1]);
            if(n%2==0)return false;
            else return true;
        }
    }
}
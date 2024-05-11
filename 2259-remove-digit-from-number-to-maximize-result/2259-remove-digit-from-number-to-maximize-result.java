class Solution {
    public String removeDigit(String number, char digit) {
        int n = number.length();
        int j = 0 ;
        for(int i = 0 ;i<n;i++)
        {
            if(number.charAt(i)==digit)
            {
                j = i;
                if((i+1)<n && number.charAt(i+1)>digit)
                    break;
            }
        }
        return number.substring(0,j)+number.substring(j+1);
    }
}
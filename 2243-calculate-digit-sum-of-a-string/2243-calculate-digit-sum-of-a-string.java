public class Solution {
    public String digitSum(String s, int k) {
        return help(s, k);
    }
    
    private String help(String s, int k) {
        int n = s.length();
        if(n<=k)return s;

        StringBuilder result = new StringBuilder();
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            sum += s.charAt(i) - '0'; 
            count++;
            
            if (count == k) {
                result.append(sum);
                sum = 0;
                count = 0;
            }
        }
        if (count > 0) result.append(sum);
        return help(result.toString(), k);
    }
}

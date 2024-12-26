public class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> addOperators(String num, int target) {
        if (num == null || num.length() == 0) return ans;
        backtrack(num, target, 0, 0, 0, new StringBuilder());
        return ans;
    }
    private void backtrack(String num, int target, int index, long currentValue, long prevOperand, StringBuilder expression) {
        if (index == num.length()) {
            if (currentValue == target) {
                ans.add(expression.toString());
            }
            return;
        }
        for (int len = 1; len <= num.length() - index; len++) {
            String strNum = num.substring(index, index + len);
            long numValue = Long.parseLong(strNum);
            if (strNum.length() > 1 && strNum.charAt(0) == '0') continue;
            if (index == 0) {
                backtrack(num, target, index + len, numValue, numValue, expression.append(strNum));
                expression.setLength(expression.length() - len);
            } else {
                backtrack(num, target, index + len, currentValue + numValue, numValue, expression.append("+").append(strNum));
                expression.setLength(expression.length() - (len + 1));
                backtrack(num, target, index + len, currentValue - numValue, -numValue, expression.append("-").append(strNum));
                expression.setLength(expression.length() - (len + 1));
                backtrack(num, target, index + len, currentValue - prevOperand + prevOperand * numValue, prevOperand * numValue, expression.append("*").append(strNum));
                expression.setLength(expression.length() - (len + 1));
            }
        }
    }
}

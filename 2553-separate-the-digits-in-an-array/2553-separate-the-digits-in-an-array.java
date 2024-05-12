class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        
        for (int num : nums) {
            String numStr = String.valueOf(num);
            for (char digit : numStr.toCharArray()) {
                answer.add(Character.getNumericValue(digit));
            }
        }
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}
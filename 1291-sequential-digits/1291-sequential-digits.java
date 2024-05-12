class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for (int digit = 1; digit < 10; digit++) {
            int num = digit;
            int nextDigit = digit;

            while (num <= high && nextDigit < 10) {
                if (num >= low) {
                    result.add(num);
                }
                nextDigit += 1;
                num = num * 10 + nextDigit;
            }
        }
        Collections.sort(result);
        return result;
    }
}
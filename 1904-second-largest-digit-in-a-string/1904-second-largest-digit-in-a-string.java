class Solution {
    public int secondHighest(String s) {
        int largest = -1;
        int secondLargest = -1;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                if (digit > largest) {
                    secondLargest = largest;
                    largest = digit;
                } else if (digit < largest && digit > secondLargest) {
                    secondLargest = digit;
                }
            }
        }
        return secondLargest;
    }
}
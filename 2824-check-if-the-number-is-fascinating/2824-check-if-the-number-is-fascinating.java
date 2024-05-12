class Solution {
    public boolean isFascinating(int n) {
        int a = 2 * n;
        int b = 3 * n;
        String c = Integer.toString(a);
        String d = Integer.toString(b);
        String e = Integer.toString(n);
        String f = e + c + d;
        char[] arr = f.toCharArray();
        for (char digit = '1'; digit <= '9'; digit++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (digit == arr[j]) {
                    count++;
                }
            }
            if (count != 1) {
                return false;
            }
        }
        return true;
    }
}

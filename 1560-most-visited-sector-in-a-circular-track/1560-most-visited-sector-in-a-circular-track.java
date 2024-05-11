class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] arr = new int[n];
        for (int i = 1; i < rounds.length; i++) {
            int k = rounds[i - 1];
            while (k!= rounds[i]) {
                arr[k - 1]++;
                k++;
                if (k > n) k = 1;
            }
        }
        int l=rounds[rounds.length-1];
        arr[l-1]++;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) max = arr[i];
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) ans.add(i + 1);
        }
        return ans;
    }
}

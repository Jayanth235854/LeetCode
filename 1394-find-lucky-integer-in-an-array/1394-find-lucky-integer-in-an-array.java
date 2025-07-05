class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        List<Integer> fre = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                count++;
            else if (count == arr[i]) {
                fre.add(arr[i]);
                count=1;
            } else
                count = 1;
        }
        if (count == arr[arr.length - 1]) {
            fre.add(arr[arr.length - 1]);
        }
        Integer[] max = fre.toArray(new Integer[fre.size()]);
        if (max.length == 0)
            return -1;
        return max[max.length - 1];
    }
}

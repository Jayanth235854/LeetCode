class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]<min)min=arr[i]-arr[i-1];
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
                ArrayList<Integer> mini =new ArrayList<>();
                mini.add(arr[i-1]);
                mini.add(arr[i]);
                list.add(mini);
            }
        }
        return list;
    }
}
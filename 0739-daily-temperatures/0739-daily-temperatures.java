class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> s=new Stack<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            while(!s.empty() && temperatures[i]>temperatures[s.peek()]){
                arr[s.peek()]=i-s.peek();
                s.pop();
            }
            s.push(i);
        }
        return arr;
    }
}
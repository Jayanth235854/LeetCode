class Solution {
    public int largestInteger(int num) {
        String s=Integer.toString(num);
        int n=s.length();
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd =new ArrayList<>();
        for(int i=0;i<n;i++){
            int digit=s.charAt(i)-'0';
            if(digit%2==0)even.add(digit);
            else odd.add(digit);
        }
        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());
        StringBuilder res=new StringBuilder();
        int e=0,o=0;
        for(int i=0;i<n;i++){
            int digit=s.charAt(i)-'0';
            if(digit%2==0)res.append(even.get(e++));
            else res.append(odd.get(o++));
        }
        return Integer.parseInt(res.toString());
    }
}
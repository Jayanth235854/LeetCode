class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length, n2=nums2.length;
        Map<Integer,Integer> hm=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        for(int i:nums2){
            while(!s.isEmpty() && i>s.peek()){
                hm.put(s.pop(),i);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            hm.put(s.pop(),-1);
        }
        int[] ans=new int[n1];
        for(int i=0;i<n1;i++){
            ans[i]=hm.get(nums1[i]);
        }
        return ans;
    }
}
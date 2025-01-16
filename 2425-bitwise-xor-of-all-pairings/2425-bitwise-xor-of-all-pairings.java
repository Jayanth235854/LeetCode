class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m=nums1.length, n=nums2.length, ans=0;
        if(n%2!=0){
            for(int i=0;i<m;i++) ans^=nums1[i];
        }
        if(m%2!=0){
            for(int i=0;i<n;i++) ans^=nums2[i];
        }
        return ans;
    }
}
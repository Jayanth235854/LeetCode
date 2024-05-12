class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int count=0;
        for(int i=0;i<nums1.length-1;i++){
            if(nums1[i]==nums1[i+1])nums1[i]=-1;
        }
        for(int i=0;i<nums2.length-1;i++){
            if(nums2[i]==nums2[i+1])nums2[i]=-1;
        }
        int n=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==-1)continue;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j])count++;
            }
        }
        int[] arr=new int[count];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==-1)continue;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j])arr[n++]=nums1[i];
            }
        }
        return arr;
    }
}
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        for(int i=0;i<arr.length;i++)arr[i]=-1;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(j+1==nums2.length){
                        break;
                    }
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[j]<nums2[k]){
                            arr[i]=nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return arr;
    }
}
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int n1=nums1.length,n2=nums2.length,n3=nums3.length;
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    arr.add(nums1[i]);
                    break;
                }
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n3;j++){
                if(nums1[i]==nums3[j]){
                    arr.add(nums1[i]);
                    break;
                }
            }
        }
        for(int i=0;i<n2;i++){
            for(int j=0;j<n3;j++){
                if(nums2[i]==nums3[j]){
                    arr.add(nums2[i]);
                    break;
                }
            }
        }
        arr=arr.stream().distinct().toList();
        return arr;
    }
}
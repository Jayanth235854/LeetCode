class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> hm=new HashMap();
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0;i<nums2.length;i++){
            if(!hm.containsKey(nums2[i][0]))hm.put(nums2[i][0],nums2[i][1]);
            else{
                hm.put(nums2[i][0],hm.get(nums2[i][0])+nums2[i][1]);
            }
        }
        int[][] arr=new int[hm.size()][2];
        int index=0;
        for(Map.Entry map:hm.entrySet()){
            arr[index][0]=(int)map.getKey();
            arr[index][1]=(int)map.getValue();
            index++;
        }
        Arrays.sort(arr,(x,y)->Integer.compare(x[0],y[0]));
        return arr;
    }
}
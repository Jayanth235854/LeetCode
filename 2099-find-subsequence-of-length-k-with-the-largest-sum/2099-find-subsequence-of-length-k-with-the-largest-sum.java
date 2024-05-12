class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        	int l=nums.length;
	int[] nums1=new int[l];
	for(int i=0;i<l;i++) {
		nums1[i]=nums[i];
	}
	Arrays.sort(nums1);
	int[] ret=new int[k];
	List<Integer> list=new ArrayList<>();
	
	for(int i=l-k;i<l;i++) {
		list.add(nums1[i]);
	}
	int v=0;
	for(int j=0;j<l;j++) {
		for(int i=0;i<list.size();i++) {
			if(nums[j]==list.get(i)) {
				ret[v]=list.get(i);
				list.remove(i);
				v++;
				break;
			}
		}
		if(v==k) break;
	}
	return ret;
    }
}
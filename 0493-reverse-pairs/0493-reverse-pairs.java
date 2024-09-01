class Solution {
    public int merge(int[] arr,int left, int mid, int right){
        List<Integer> a=new ArrayList<>();
        int l=left, r=mid+1;
        int j=mid+1, count=0;
        for(int i=left;i<mid+1;i++){
            while(j<=right && arr[i]/2.0 >arr[j])j++;
            count+=j-(mid+1);
        }
        while(l<=mid && r<=right){
            if(arr[l]<arr[r])a.add(arr[l++]);
            else a.add(arr[r++]);
        }
        while(l<=mid)a.add(arr[l++]);
        while(r<=right)a.add(arr[r++]);
        for(int i=left;i<=right;i++)arr[i]=a.get(i-left);
        return count;
    }
    public int mergeSort(int [] arr,int left, int right){
        int count=0;
        if(left<right){
            int mid=(left+ right)/2;
            count+=mergeSort(arr, left,mid);
            count+=mergeSort(arr, mid+1,right);
            count+=merge(arr,left,mid,right);
        }
        return count;
    }
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return mergeSort(nums,0,n-1);
    }
}
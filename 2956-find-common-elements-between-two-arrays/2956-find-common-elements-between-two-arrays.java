class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int a=0,b=0;
        int[] arr1=new int[m];
        int[] arr2=new int[n];
        for(int i=0;i<m;i++){
            arr1[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr2[i]=nums2[i];
        }
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(arr1[i]==arr1[j])arr1[j]=0;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr1[i]==0)continue;
                if(arr1[i]==arr2[j])a++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr2[i]==arr2[j])arr2[j]=0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr2[i]==0)continue;
                if(arr2[i]==nums1[j])b++;
            }
        }
        int[] ans=new int[2];
        ans[0]=b;
        ans[1]=a;
        return ans;
    }
}
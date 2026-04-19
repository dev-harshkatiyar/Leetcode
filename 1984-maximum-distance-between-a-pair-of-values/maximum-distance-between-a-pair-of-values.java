class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int max=0;
        int m=nums1.length,n=nums2.length;

        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                max=Math.max(max,j-i);
                j++;
            }else{
                i++;
            }
        }
        return max;
    }
}
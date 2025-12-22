class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int count=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int avgsum=sum/k;
        if(avgsum>=threshold){
            count++;
        }
        for(int i=1;i<=n-k;i++){
            sum+=arr[i+k-1]-arr[i-1];
            avgsum=sum/k;
            if(avgsum>=threshold){
                count++;
            }
        }
        return count;
    }
}
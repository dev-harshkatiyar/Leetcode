class Solution {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int zeroes[]=new int[n];

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==0)
                    count++;
                else break;    
            }
            zeroes[i]=count;
        }
        int swaps=0;
        for(int i=0;i<n;i++){
            int need=n-1-i;
            int j=i;
            while(j<n && zeroes[j]<need){
                j++;
            }if(j==n){
                return -1;
            }
            while(j>i){
                int temp=zeroes[j];
                zeroes[j]=zeroes[j-1];
                zeroes[j-1]=temp;
                swaps++;
                j--;
            }
        }
        return swaps;
    }
}
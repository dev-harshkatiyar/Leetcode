class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        long count=0;
        long sum=0;
        long Smallest=Long.MAX_VALUE;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]<0){
                    count++;
                }
                long val=Math.abs(matrix[i][j]);
                Smallest=Math.min(Smallest,val);
                sum+=val;
            }
        }
        if(count%2==0){
            return sum;
        }
        return sum-2*Smallest;
    }
}
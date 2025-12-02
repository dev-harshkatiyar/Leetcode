class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int startrow=0;
        int endrow=n-1;
        int startcol=0;
        int endcol=m-1;

        while(startrow<=endrow && startcol<=endcol)
        {
            //first row
            for(int j=startcol;j<=endcol;j++)
            {
                result.add(matrix[startrow][j]);
            }
            startrow++;
            //end col
            for(int i=startrow;i<=endrow;i++)
            {
                result.add(matrix[i][endcol]);
            }
            endcol--;
            if(startrow<=endrow)
            {
            //last row
            for(int j=endcol;j>=startcol;j--)
            {
                result.add(matrix[endrow][j]);
            }
            endrow--;
            }
            if(startcol<=endcol)
            {
            //firstcol
            for(int i=endrow;i>=startrow;i--)
            {
                result.add(matrix[i][startcol]);
            }
            startcol++;
            }
        }
        return result;
    }
}
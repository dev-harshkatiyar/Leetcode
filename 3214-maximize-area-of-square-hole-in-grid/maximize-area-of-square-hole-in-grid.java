class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int maxH = 1, maxV = 1;
        int count = 1;
        for (int i = 1; i < hBars.length; i++) {
            if (hBars[i] - hBars[i - 1] == 1) {
                count++;
            } else {
                maxH = Math.max(maxH, count);
                count = 1;
            }
        }
        maxH = Math.max(maxH, count);
        count = 1;
        for (int i = 1; i < vBars.length; i++) {
            if (vBars[i] - vBars[i - 1] == 1) {
                count++;
            } else {
                maxV = Math.max(maxV, count);
                count = 1;
            }
        }
        maxV = Math.max(maxV, count);

        int side = Math.min(maxH + 1, maxV + 1);
        return side * side;
    }
}

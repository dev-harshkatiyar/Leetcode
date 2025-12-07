class Solution {
    public int digitsum(int n){
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, digitsum(num));
        }
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        java.util.Arrays.sort(idx, (a, b) -> {
            int da = map.get(nums[a]);
            int db = map.get(nums[b]);
            if (da != db) return da - db;   
            return nums[a] - nums[b];       
        });
        
        int[] targetPos = new int[n];
        for (int i = 0; i < n; i++) {
            targetPos[idx[i]] = i;
        }
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || targetPos[i] == i) continue;
            int cycleLen = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = targetPos[j];
                cycleLen++;
            }
            if (cycleLen > 1) {
                swaps += cycleLen - 1;
            }
        }
        return swaps;
    }
}

class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; ) {
            char ch = s.charAt(i);
            int len = 0;

            while (i < n && s.charAt(i) == ch) {
                i++;
                len++;
            }
            maxLen = Math.max(maxLen, len);
        }

        maxLen = Math.max(maxLen, twoCharBalanced(s, 'a'));
        maxLen = Math.max(maxLen, twoCharBalanced(s, 'b'));
        maxLen = Math.max(maxLen, twoCharBalanced(s, 'c'));

        HashMap<String, Integer> map = new HashMap<>();
        int countA = 0, countB = 0, countC = 0;

        map.put("0#0", -1);

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == 'a') countA++;
            else if (ch == 'b') countB++;
            else countC++;

            int diff1 = countA - countB;
            int diff2 = countA - countC;

            String key = diff1 + "#" + diff2;

            if (map.containsKey(key)) {
                maxLen = Math.max(maxLen, i - map.get(key));
            } else {
                map.put(key, i);
            }
        }

        return maxLen;
    }

    private int twoCharBalanced(String s, char skip) {
        int n = s.length();
        int maxLen = 0;
        int i = 0;

        while (i < n) {
            if (s.charAt(i) == skip) {
                i++;
                continue;
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, i - 1);
            int count1 = 0, count2 = 0;
            int j = i;
            while (j < n && s.charAt(j) != skip) {
                char ch = s.charAt(j);
                if (skip == 'a') {
                    if (ch == 'b') count1++;
                    else count2++;
                } else if (skip == 'b') {
                    if (ch == 'a') count1++;
                    else count2++;
                } else {
                    if (ch == 'a') count1++;
                    else count2++;
                }
                int diff = count1 - count2;
                if (map.containsKey(diff)) {
                    maxLen = Math.max(maxLen, j - map.get(diff));
                } else {
                    map.put(diff, j);
                }
                j++;
            }
            i = j;
        }
        return maxLen;
    }
}
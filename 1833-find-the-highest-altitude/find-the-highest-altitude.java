class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;

        int[] prefSum = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefSum[i + 1] = prefSum[i] + gain[i];
        }

        int res = Integer.MIN_VALUE;

        for (int i = 0; i <= n; i++) {
            res = Math.max(res, prefSum[i]);
        }

        return res;
    }
}
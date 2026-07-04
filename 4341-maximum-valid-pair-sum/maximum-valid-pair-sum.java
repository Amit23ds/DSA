class Solution {
    public int maxValidPairSum(int[] nums, int k) {

        int[] pref = nums;

        int best = pref[0];
        int ans = 0;

        for (int j = k; j < pref.length; j++) {

            best = Math.max(best, pref[j - k]);

            ans = Math.max(ans, best + pref[j]);
        }

        return ans;
    }
}
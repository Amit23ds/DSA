class Solution {
    public String removeKdigits(String num, int k) {
        char[] nums = num.toCharArray();
        int n = nums.length;

        if (n == k)
            return "0";

        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top >= 0 && k > 0 && nums[top] > nums[i]) {
                top--;
                k--;
            }

            nums[++top] = nums[i];
        }

        if (k > 0)
            top -= k;

        int idx = 0;
        while (idx < top && nums[idx] == '0')
            idx++;

        int len = top - idx + 1;

        if (len <= 0)
            return "0";

        return new String(nums, idx, len);

    }
}
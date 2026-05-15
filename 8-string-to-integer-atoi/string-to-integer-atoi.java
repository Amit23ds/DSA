class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i == n) return 0;
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        return helper(s, i, sign, 0);
    }

    private int helper(String s, int i, int sign, int res) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return res * sign;
        }
        int digit = s.charAt(i) - '0';
        if (res > (Integer.MAX_VALUE - digit) / 10) {
            return (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        res = res * 10 + digit;
        return helper(s, i + 1, sign, res);
    }
}
class Solution {
    private int lo, maxLength;
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n < 2)
            return s;
        for(int i = 0; i < n; i++) {
            isPalindrome(s, i, i);
            isPalindrome(s, i, i + 1);
        }
        return s.substring(lo, lo + maxLength);
    }

    private void isPalindrome(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if(maxLength < right - left - 1) {
            lo = left + 1;
            maxLength = right - left - 1;
        }
    }
}
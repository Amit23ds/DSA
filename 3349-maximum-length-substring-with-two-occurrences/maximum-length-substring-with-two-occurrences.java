class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int l=0;
        int res=0;
        for(int r=0;r<s.length();r++) {
            int ch=s.charAt(r)-'a';
            freq[ch]++;
            while(freq[ch]>2) {
                freq[s.charAt(l)-'a']--;
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;

    }
}
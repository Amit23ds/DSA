class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int[] freq= new int[26];
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            freq[c-'a']++;
        }
        StringBuilder left = new StringBuilder();
        StringBuilder mid = new StringBuilder();
        for(int i=0;i<26;i++){
            for(int j = 0; j < freq[i] / 2; j++) {
                left.append((char)(i+'a'));
            }
            if(freq[i]%2==1) mid.append((char)(i+'a'));
        }
        StringBuilder right = new StringBuilder(left).reverse();
        
        return left.toString()+mid.toString()+right.toString();
    }
}
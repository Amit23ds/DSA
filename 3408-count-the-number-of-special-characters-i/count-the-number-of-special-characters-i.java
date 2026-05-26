class Solution {
    public int numberOfSpecialChars(String word) {
        int[] freqS=new int[26];
        int[] freqC=new int[26];

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            if(ch>='a' && ch<='z'){
                freqS[ch-'a']++;
            }
            else if(ch>='A' && ch<='Z'){
                freqC[ch-'A']++;
            }
        }
        int cnt=0;
        for(int i=0;i<26;i++){
            if(freqS[i]!=0 && freqC[i]!=0) cnt++;
        }
        return cnt;
    }
}
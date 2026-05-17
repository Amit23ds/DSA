class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n=s.length();
        for(int i=0;i<n-1;i++){
            int num = s.charAt(i)-'0';
            int num2 = s.charAt(i+1)-'0';
            if(Math.abs(num-num2)>2) return false;
        }
        return true;
    }
}
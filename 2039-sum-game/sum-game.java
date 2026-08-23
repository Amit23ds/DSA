class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int firstHalf=0, secondHalf=0;
        int rQ=0, lQ=0;
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                rQ++;
                continue;
            }
            firstHalf+=num.charAt(i)-'0';
        }
        for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                lQ++;
                continue;
            }
            secondHalf+=num.charAt(i)-'0';
        }
        if((rQ+lQ)%2==1) return true;

        if((2*firstHalf+9*rQ)==(2*secondHalf+9*lQ)) return false;

        return true;
    }
}               
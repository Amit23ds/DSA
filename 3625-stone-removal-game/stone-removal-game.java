class Solution {
    public boolean canAliceWin(int n) {
        int x=10;
        while(n>=x){
            n=n-x;
            x--;
        }
        if(x%2==0){
            return false;
        }
        return true;
    }
}
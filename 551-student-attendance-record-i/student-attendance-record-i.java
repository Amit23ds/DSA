class Solution {
    public boolean checkRecord(String s) {
        int a=0, l=0;
        for(char ch:s.toCharArray()){
            if(ch=='A'){
                a++;
                if(a>=2) return false;
            }
            if(ch=='L'){
                l++;
                if(l>=3){
                    return false;
                }
            }
            else{
                l=0;
            }
        }
        return true;
    }
}
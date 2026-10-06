class Solution {
    public int minAddToMakeValid(String s) {
        int close=0;
        int open=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                open++;
            }else if(ch==')' && open>0){
                open--;
            }else{
                close++;
            }
        }
        return close+open;
    }
}
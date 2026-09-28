class Solution {
    public int maxDepth(String s) {
        int cnt=0;
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                cnt++;
            }
            if(ans<cnt){
                ans=cnt;
            }
            if(ch==')'){
                cnt--;
            }
        }
        return ans;
    }
}
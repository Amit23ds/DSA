class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxcount=0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='('){
                count++;
            }
            if(maxcount<count){
                maxcount=count;
            }
            if(c==')'){
                count--;
            }
        }
        return maxcount;
    }
}
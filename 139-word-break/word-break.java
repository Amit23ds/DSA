class Solution {
    Boolean[] t;
    public boolean wordBreak(String s, List<String> wordDict) {
        t=new Boolean[s.length()];
        return helper(s,wordDict,0);
    }
    boolean helper(String s, List<String> wordDict,int idx){
        if(idx==s.length()){
            return true;
        }
        if(t[idx]!=null){
            return false;
        }
        for(int end=idx+1;end<=s.length();end++){
            if(wordDict.contains(s.substring(idx,end))){
                if(helper(s,wordDict,end)){
                    return t[idx]=true;
                }
            }
        }
        return t[idx]=false;
    }
}
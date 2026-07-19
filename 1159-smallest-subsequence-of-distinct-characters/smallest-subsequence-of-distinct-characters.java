class Solution {
    public String smallestSubsequence(String s) {
        int[] vis = new int[26];
        int[] num = new int[26];

        for(char ch :s.toCharArray()) num[ch-'a']++;

        StringBuilder stk = new StringBuilder();
        for(char ch: s.toCharArray()){
            int idx=ch-'a';
            if(vis[idx]==0){
                while(stk.length()>0 && stk.charAt(stk.length()-1)>ch){
                    int top_idx = stk.charAt(stk.length()-1)-'a';
                    if(num[top_idx]>0){
                        vis[top_idx] =0;
                        stk.deleteCharAt(stk.length()-1);
                    }else{
                        break;
                    }
                }
                vis[idx]=1;
                stk.append(ch);
            }
            num[idx]--;
        }
        return stk.toString();
    }
}
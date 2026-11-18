class Solution {
    public int minChanges(String s) {
        int n=s.length();
        char ch=s.charAt(0);
        int cnt=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==ch){
                cnt++;
                continue;
            }
            if(cnt%2==0){
                cnt=1;
            }else{
                res+=1;
                cnt=0;
            }
            ch=s.charAt(i);
        }
        return res;
    }
}
class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();

        if(n<m) return "";
        
        int[] hash = new int[256];

        int l=0, r=0;
        int minlen = 1000000000;

        int sidx= -1;
        int cnt=0;

        for(int i =0;i<m;i++){
            hash[t.charAt(i)]++;
        }

        while(r<n){
            if(hash[s.charAt(r)]>0) cnt++;
            hash[s.charAt(r)]--;
            while(cnt==m){
                if((r-l+1)<minlen){
                    minlen=r-l+1;
                    sidx=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0) cnt--;
                l++;
            }
            r++;
        }
            return sidx==-1 ? "" : s.substring(sidx, sidx + minlen);

    }
}
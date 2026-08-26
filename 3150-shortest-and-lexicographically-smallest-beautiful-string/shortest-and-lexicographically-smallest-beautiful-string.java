class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l=0,r=0;
        int cnt=0;
        int minLen=Integer.MAX_VALUE;
        int i=0,j=0;
        while(r<s.length()){
            if(s.charAt(r)=='1'){
                cnt++;
            }
            while(cnt>k){
                if(s.charAt(l)=='1') cnt--;
                l++;
            }
            if(cnt==k){
                while(s.charAt(l)=='0') l++;
                int len=r-l+1;
                if(len<minLen 
                    ||len==minLen && s.substring(l,r+1).compareTo(s.substring(i,j))<0){
                    minLen=len;
                    i=l;
                    j=r+1;
                }
                
                
            }
            r++;
        }
        return s.substring(i,j);
    }
}
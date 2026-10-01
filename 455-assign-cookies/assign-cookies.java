class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;//g
        int j=0;//s
        while(j<n && i<g.length){
            if(g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}
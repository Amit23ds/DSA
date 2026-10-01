class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;//g
        int j=0;//s
        while(j<s.length && i<g.length){
            if(g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}
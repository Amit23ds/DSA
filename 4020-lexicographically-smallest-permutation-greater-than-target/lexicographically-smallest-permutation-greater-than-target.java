class Solution {
    String res="";

    boolean solve(StringBuilder curr,int[] count,String target,int i,boolean greater) {
        if(i==target.length()){
            if(greater){
                res=curr.toString();
                return true;
            }
            return false;
        }
        for(char ch='a';ch<='z';ch++){
            if(count[ch-'a']==0) continue;
            if(greater==false && ch<target.charAt(i)) continue;

            curr.append(ch);
            count[ch-'a']--;

            boolean isGreater=greater || ch>target.charAt(i);

            if(solve(curr,count,target,i+1,isGreater)){
                return true;
            }
            curr.deleteCharAt(curr.length()-1);
            count[ch-'a']++;
        }
        return false;
    }

    public String lexGreaterPermutation(String s, String target) {
        int[] freq =new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }   
        StringBuilder curr = new StringBuilder();
        solve(curr,freq,target,0,false);
        return res;
    }
}
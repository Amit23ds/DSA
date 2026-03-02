class Solution {
    public String longestCommonPrefix(String[] strs) {
        //if array is sorted means all the string value from 1st to last have common 
        // means we have to check only 1st and last element of the array
       StringBuilder sb = new StringBuilder();
       Arrays.sort(strs);
       String first=strs[0];
       String last=strs[strs.length-1];
       for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return sb.toString();
            }
            sb.append(first.charAt(i));
       }
       return sb.toString();
    }
}
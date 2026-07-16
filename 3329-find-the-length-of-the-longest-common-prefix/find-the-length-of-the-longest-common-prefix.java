class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet <String> set=new HashSet<>();
        for(int i:arr1){
         String s=String.valueOf(i);
         String pre="";
         for(char ch:s.toCharArray())
         {
            pre+=ch;
            set.add(pre);
         }
        }
        
        int m=0;
        for(int i:arr2)
        {
            String s=String.valueOf(i);
            String pre="";
            for(char ch:s.toCharArray()){
                pre+=ch;
                if(set.contains(pre)){
                    m=Math.max(m,pre.length());
                }
            }
        }
        return m;
    }
}
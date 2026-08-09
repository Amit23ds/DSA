class Solution {
    List<String> result=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        String sb="";
        helper(digits,hm,0,sb);
        return result;
    }
    void helper(String digit,HashMap<Character,String> hm,int idx,String sb){
        if(idx>=digit.length()){
            result.add(sb);
            return;
        }
        char ch = digit.charAt(idx);
        String temp=hm.get(ch);
        for(int i=0;i<temp.length();i++){
           // sb=sb+temp.charAt(i);
            helper(digit,hm,idx+1,sb+temp.charAt(i));
            //sb.deleteCharAt(idx);
        }
    }
}
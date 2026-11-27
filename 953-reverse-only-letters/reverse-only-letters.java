class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                st.push(c);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                ans.append(st.pop());
            }else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
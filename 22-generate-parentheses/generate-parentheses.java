class Solution {
    public boolean isValid(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch== '(')
                sum++;
            else
                sum--;
            if(sum<0)
                return false;
        }
        return sum==0;
    }
    private void generate(String curr, int n, int length, List<String> result) {
        if(length==2*n) {
            if(isValid(curr))
                result.add(curr);
            return;
        }
        curr+= '(';
        generate(curr,n,length+1,result);
        curr=curr.substring(0,curr.length()-1);

        curr+= ')';
        generate(curr,n,length+1,result);
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("",n,0,result);
        return result;
    }
}
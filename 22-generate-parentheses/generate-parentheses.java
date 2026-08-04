class Solution {
    // public boolean isValid(String s) {
    //     int sum = 0;
    //     for(int i=0;i<s.length();i++){
    //         char ch =s.charAt(i);
    //         if(ch== '(')
    //             sum++;
    //         else
    //             sum--;
    //         if(sum<0)
    //             return false;
    //     }
    //     return sum==0;
    // }
    // private void generate(String curr, int n, int length, List<String> result) {
    //     if(length==2*n) {
    //         if(isValid(curr))
    //             result.add(curr);
    //         return;
    //     }
    //     curr+= '(';
    //     generate(curr,n,length+1,result);
    //     curr=curr.substring(0,curr.length()-1);

    //     curr+= ')';
    //     generate(curr,n,length+1,result);
    // }
    List<String> result = new ArrayList<>();
    private void solve(int n, String curr, int open, int close){
        if(curr.length()==2*n){
            result.add(curr);
            return;
        }
        if(open<n){
            curr+= '(';
            solve(n,curr,open+1,close);
            curr=curr.substring(0,curr.length()-1);
        }if(close<open){
            curr+= ')';
            solve(n,curr,open,close+1);
            curr=curr.substring(0,curr.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        // List<String> result = new ArrayList<>();
        // generate("",n,0,result);
        solve(n,"",0,0);
        return result;
    }
}
class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        helper(s,0,new ArrayList<>());
        return result;
    }
    boolean isPalindrome(String s){
        s=s.toLowerCase();
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    void helper(String s,int idx,List<String> temp){
        if(idx>=s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s.substring(idx,i+1))){
                temp.add(s.substring(idx,i+1));
                helper(s,i+1,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}
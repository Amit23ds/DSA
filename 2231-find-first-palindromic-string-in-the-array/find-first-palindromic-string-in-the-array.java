class Solution {
    private boolean isPalindrome(String x){
        int i=0;
        int j=x.length()-1;
        while(i<=j){
            if(x.charAt(i)==x.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }    
        }
        return "";
    }
}
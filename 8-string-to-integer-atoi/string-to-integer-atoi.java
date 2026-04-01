class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int n= s.length();
        if(n==0){
            return 0;
        }
        int i=0;
        int value=1;
        int res=0;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
                value=s.charAt(i)=='-' ? -1:1;
                i++;
            }
        while(i<n){
            
            if(Character.isDigit(s.charAt(i))){
                int x = s.charAt(i) - '0';
                if (res > (Integer.MAX_VALUE - x) / 10){
                    return value==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
                }
                res=res*10+x;
                i++;
            }else{
                break;
            }
        }
        return (res*value);
    }
}
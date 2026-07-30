class Solution {
    
    public int myAtoi(String s) {
        s=s.trim();
        int n=s.length();
        if(s.length()==0) return 0;
        int i=0;
        int sign=1;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }else if(s.charAt(i)=='+'){
            sign=1;
            i++;
        }else if(!Character.isDigit(s.charAt(i))){
            return 0;
        }
        long ans=0;
        while(i<n){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                int digit=c-'0';
                if (ans > Integer.MAX_VALUE / 10 ||
                    (ans == Integer.MAX_VALUE / 10 && digit > (sign == 1 ? 7 : 8))){
                        if(sign==1) return Integer.MAX_VALUE;
                        else return Integer.MIN_VALUE;
                }
                ans=ans*10+digit;
            }else if(!Character.isDigit(c)){
                ans=ans*sign;
                if(ans>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }else if(ans<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
                return (int)ans;
            }
            i++;
        }
        ans=ans*sign;
        if(ans>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(ans<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)ans;
    }
}
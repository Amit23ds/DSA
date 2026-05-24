class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<password.length();i++){
            h.add(password.charAt(i));
        }
        int cnt=0;
        for(char ch: h){
            if(ch>='a' && ch<='z')
                cnt+=1;
           else if(ch>='A' && ch<='Z')
                cnt+=2;
            else if(ch>='0' && ch<='9')
                cnt+=3;
            else
                cnt+=5;
        }
        return cnt;
        
    }
}
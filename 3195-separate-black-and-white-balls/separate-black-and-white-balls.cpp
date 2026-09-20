class Solution {
public:
    long long minimumSteps(string s) {
        long long res=0,zero_cnt=0;
        for(int i=s.size()-1;i>=0;i--){
            if(s[i]=='0'){
                zero_cnt++;
            }else{
                res+=zero_cnt;
            }
        }
        return res;
    }
};
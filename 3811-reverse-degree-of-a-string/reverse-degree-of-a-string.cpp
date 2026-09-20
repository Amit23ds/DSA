class Solution {
public:
    int reverseDegree(string s) {
        int sum=0;
        for(int i=0;i<s.size();i++){
            char c=s[i];
            int revNum=26-(c-'a');
            int pos=i+1;
            sum+=revNum*pos;
        }
        return sum;
    }
};
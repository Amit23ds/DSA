class Solution {
    public int countDigits(int num) {
        int nums=num;
        int count=0;
        while(nums>0){
            int val=nums%10;
            if(num%val==0){
                count++;
            }
            nums/=10;
        }
        return count;
    }
}
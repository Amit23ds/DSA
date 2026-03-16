class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int pos=n-1;
        int[] res=new int[n];
        while(left<=right){
            if((nums[left]*nums[left])>(nums[right]*nums[right])){
                res[pos]=(nums[left]*nums[left]);
                left++;
            }
            else{
                res[pos]=(nums[right]*nums[right]);
                right--;
            }
            pos--;
        }
        return res;
    }
}
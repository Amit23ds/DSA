class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] res=new int[nums.length];
        int i=1;
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(k%2==0){
                res[k]=nums[i];
                i+=2;
            }else{
                res[k]=nums[j];
                j+=2;
            }
        }  
        return res;
    }
}
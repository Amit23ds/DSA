class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n=numbers.length;
        int i=0, j=n-1;
        int[] res=new int[2];
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                res[0]=i+1;
                res[1]=j+1;
            } 
            if(sum<target){
                i++;
            }
            else j--;
        }
        return res;
    }
}
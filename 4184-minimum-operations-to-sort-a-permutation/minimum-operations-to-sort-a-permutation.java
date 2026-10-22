class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        int i=0;
        while(nums[i]!=0){
            i++;
        }
        boolean asc=true;
        boolean des=true;
        for(int j=1;j<n;j++){
            int temp=nums[(i+j)%n];
            if(temp!=j){
                asc=false;
            }
            if(temp!=n-j){
                des=false;
            }
            if(!asc && !des) return -1;
        }
        if(asc){
            return Math.min(i,n-i+2);
        }
        return Math.min(n-i,i+2);
    }
}
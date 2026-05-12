class Solution {
    private boolean helper(int[][] nums,int mid){
        int k=mid;
        for(int i=0;i<nums.length;i++){
            if(k>=nums[i][1]){
                k-=nums[i][0];
            }else{
                return false;
            }
        }
        return true;
    }
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a,b) -> (b[1]-b[0]) - (a[1]-a[0]));
        int high=0;
        for(int i=0;i<tasks.length;i++){
            high+=tasks[i][1];
        }
        int res=0;
        int low=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(tasks,mid)==true){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
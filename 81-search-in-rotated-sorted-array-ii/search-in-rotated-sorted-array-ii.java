class Solution {
    // public void removeDuplicates(int[] nums) {
    //     int j=0;
    //     for(int i=1;i<nums.length;i++){
    //         if(nums[i]!=nums[j]){
    //             j++;
    //             nums[j]=nums[i];          
    //         }
    //     }
    //     // return j+1;
    // }
    public boolean search(int[] nums, int target) {
        // removeDuplicates(nums);
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]==target) return true;
            if (nums[low] == nums[mid] && nums[mid]== nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>=nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}
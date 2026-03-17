class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer> > x = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0){
                if(nums[i]==nums[i-1]) continue;
            }    
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(nums[k]+nums[j]<-nums[i]){
                    j++;
                }
                else if(nums[k]+nums[j]>-nums[i]){
                    k--;
                }
                else if(nums[k]+nums[j]==-nums[i]){

                    x.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return x;
    }
}
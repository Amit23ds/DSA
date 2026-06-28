class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;


        for(int l=0;l<n-2;l++){
            int m=l+1, r=n-1;
            if (l > 0 && nums[l] == nums[l - 1])
                 continue;
            while(m<r){
                int sum=nums[l]+nums[m]+nums[r];
                if(sum==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[l]);
                    list.add(nums[m]);
                    list.add(nums[r]);
                    ans.add(list);
                    m++;
                    r--;
                    while (m < r && nums[m] == nums[m - 1]) m++;
                    while (m < r && nums[r] == nums[r + 1]) r--;
                }
                else if(sum>0){
                    r--;
                }else{
                    m++;
                }
            }
        }
        return ans;

    }
}
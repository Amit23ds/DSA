class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        List<List<Integer>> list = new ArrayList<>();



        for(int l=0;l<n-2;l++){
            int m=l+1;
            int r=n-1;
            if(l>0 && nums[l]==nums[l-1]) continue;
            while(m<r){
                int sum = nums[l]+nums[m]+nums[r];
                if(sum==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[l]);
                    temp.add(nums[m]);
                    temp.add(nums[r]);
                    list.add(temp);
                    m++;
                    r--;
                    while(m<r && nums[m]==nums[m-1]) m++;
                    while(m<r && nums[r]==nums[r+1]) r--;
                }else if(sum >0){
                    r--;
                }else{
                    m++;
                }
            }
        }
        return list;
    }
}
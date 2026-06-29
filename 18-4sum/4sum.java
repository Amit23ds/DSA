class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n=nums.length;
        if(n<4){
            return res;
        }
        Arrays.sort(nums);
        
        for(int a=0;a<n-3;a++){
            if(a>0 && nums[a]==nums[a-1]) continue;
            for(int b=n-1;b>=3;b--){
                if(b<n-1 && nums[b]==nums[b+1]) continue;
                int c=a+1, d=b-1;
                while(c<d){
                    long sum=0L+nums[a]+nums[b]+nums[c]+nums[d];
                    if(sum==target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[a]);
                        list.add(nums[b]);
                        list.add(nums[c]);
                        list.add(nums[d]);
                        
                        res.add(list);
                        c++;
                        d--;
                        while(c<d && nums[c]==nums[c-1]) c++;
                        while(c<d && nums[d]==nums[d+1]) d--;
                    }
                    else if(sum>target){
                        d--;
                    }else{
                        c++;
                    }
                }
            }
        }
        return res;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=1, cnt2=0;
        int el1=nums[0], el2=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=1; i<n;i++){
            if(nums[i]==el1){
                cnt1++;
            }
            else if(nums[i]==el2){
                cnt2++;
            }
            else if(cnt1==0){
                el1=nums[i];
                cnt1++;
            }
            else if(cnt2==0){
                el2=nums[i];
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;

        for (int num : nums) {
            if (num == el1) cnt1++;
            else if (num == el2) cnt2++;
        }
         List<Integer> res = new ArrayList<>();

        if (cnt1 > n / 3) res.add(el1);
        if (cnt2 > n / 3) res.add(el2);

        return res;

    }
}
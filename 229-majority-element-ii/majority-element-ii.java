class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int el1=-1, el2=-1;
        int v1=0, v2=0;
        for(int i=0;i<nums.length;i++){
            if(v1==0 && nums[i]!=el2){
                el1=nums[i];
                v1=1;
            }
            else if(v2==0 && nums[i]!=el1){
                el2=nums[i];
                v2=1;
            }
            else if(nums[i]==el1){
                v1++;
            }else if(nums[i]==el2){
                v2++;
            }else{
                v1--;
                v2--;
            }
        }

        int cnt1=0, cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1) cnt1++;
            else if(nums[i]==el2) cnt2++;
            
        }
        List<Integer> ls = new ArrayList<>();
        if(cnt1>nums.length/3) ls.add(el1);
        if(cnt2>nums.length/3) ls.add(el2);

        return ls;
    }
}
class Solution {
    private boolean search(int[] nums,int k){
        for(int i=0;i<nums.length;i++){
            if(k==nums[i]){
                return true;
            }
        }
        return false;
    }
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=1;i<=n+k+1;i++){
            if(!search(arr,i)){
                list.add(i);
            }
        }
        return list.get(k-1);    
    }
}
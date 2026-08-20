class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];

        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int i=2;
        while(i<n){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
            i++;
        }
        int k=0;
        for(int x:arr1){
            res[k++]=x;
        }
        for(int x:arr2){
            res[k++]=x;
        }
        return res;


    }
}
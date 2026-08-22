class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums=arr.clone();
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int rank=1;
        for(int num:nums) {
            if(!hm.containsKey(num)){
                hm.put(num,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
}
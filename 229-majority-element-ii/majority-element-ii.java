class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int n = nums.length;

        int m= n/3;

        int cnt=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
 
        for(Integer key : hm.keySet()){
            if(hm.get(key)>n/3){
                list.add(key);
            }
        }
        return list;

    }
}
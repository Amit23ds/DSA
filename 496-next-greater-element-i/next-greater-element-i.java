class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();

        Stack<Integer> st = new Stack<>();

        int[] res = new int[nums1.length];

        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && nums2[i]>st.peek()){
                hm.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        
        for(int i=0;i<nums1.length;i++){
            res[i]=hm.getOrDefault(nums1[i],-1);
        }
        return res;


    }
}
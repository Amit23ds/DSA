class Solution {
    private int minElement(int[] nums){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
    private int maxElement(int[] nums){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public static boolean isPossible(int[] bloomDays, int day, int m, int k) {
        int count = 0; 
        int bouquets = 0; 

        for (int bloom : bloomDays) {
            if (bloom <= day) {
                count++; 
                if (count == k) {
                    bouquets++; 
                    count = 0; 
                }
            } else {
                count = 0; 
            }
        }
        return bouquets >= m; 
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        long required = (long) m * k;
        if (required > bloomDay.length) return -1;
        //int result=0;
        int low=minElement(bloomDay);
        int high=maxElement(bloomDay);
        while(low<=high){
            int mid=(high+low)/2;
            if (isPossible(bloomDay, mid, m, k)) {
                //result = mid; 
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        return low;
    }
}
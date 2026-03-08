class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min = Integer.MAX_VALUE;
        int res=-1;
        int n=capacity.length;
        for(int i =0;i<n;i++){
            if(capacity[i]>=itemSize){
               if(min>capacity[i]){
                   min=capacity[i];
                   res=i;
               }
            }
        }
        return res;
    }
}
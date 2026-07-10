class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        long time=0;
        int st=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end+1){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                time+=end-st+1;
                st=intervals[i][0];
                end=intervals[i][1];
            }
        }
        time+=end-st+1;
        long total=(brightness+2)/3;
        return total*time;
    }
}
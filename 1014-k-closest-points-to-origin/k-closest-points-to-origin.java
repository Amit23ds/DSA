class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(
                        (a,b)->a[1]-b[1]
                                );

        for(int i=0;i<points.length;i++){
            int x=(points[i][0]*points[i][0])+ (points[i][1]*points[i][1]);
            pq.add(new int[]{i,x});
        }
        int[][] res=new int[k][2];
        int i=0;
        while(i<k){
            int idx=pq.remove()[0];
            res[i][0]=points[idx][0];
            res[i][1]=points[idx][1];
            i++;
        }
        return res;
    }
}
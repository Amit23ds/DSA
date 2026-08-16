class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        if(drones==null || drones.length==0){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<drones.length;i++){
            int sum=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(min>sum && sum<=drones[i][2]){
                ans=i;
                min=sum;
            }
        }
        return ans;
    }
}
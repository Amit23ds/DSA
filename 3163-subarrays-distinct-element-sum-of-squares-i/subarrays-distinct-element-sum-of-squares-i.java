class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int sum=0;

        for(int i=0;i<n;i++){
            boolean[] vis=new boolean[101];
            int cnt=0;
            for(int j=i;j<n;j++){
                int num=nums.get(j);
                if(!vis[num]){
                    vis[num]=true;
                    cnt++;
                }
                sum+=cnt*cnt;
            }
        }
        return sum;
    }
}
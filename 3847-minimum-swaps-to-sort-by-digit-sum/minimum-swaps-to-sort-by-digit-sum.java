class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        Integer[] sorted=new Integer[n];
        for(int i=0;i<n;i++) sorted[i]=nums[i];
        Arrays.sort(sorted,(a,b)->{
            int sa=digitSum(a), sb=digitSum(b);
            if(sa!=sb) return sa-sb;
            return a-b;
        });

        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(sorted[i],i);
        }
        boolean[] vis=new boolean[n];
        int swap=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                swap++;
                int j=i;
                while(!vis[j]){
                    vis[j]=true;
                    j=hm.get(nums[j]);
                }
            }
        }
        return n-swap;
    }
    int digitSum(int x){
        int s=0;
        while(x>0){
            s+=x%10;
            x/=10;
        }
        return s;
    }
}
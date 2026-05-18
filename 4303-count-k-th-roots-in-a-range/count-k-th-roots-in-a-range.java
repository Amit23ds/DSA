class Solution {
    private int kthroot(int n,int k){
        //binary search
        int low=0;
        int high=n;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            long val = 1;
            for(int i=0;i<k;i++){
                val *= mid;
                if(val > n) break;
            }
            if(val<=n){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int countKthRoots(int l, int r, int k) {
        if(k==1) return r-l+1;
        int left = (l==0) ? 0:kthroot(l-1,k);
        int right= kthroot(r,k);
        int ans=right-left;
        if(l==0) ans++;
        return ans;
    }
}
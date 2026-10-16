class Solution {
    long mod=1_000_000_007L;
    int n;
    long[] sqSumSegTree;
    long[] sumSegTree;
    long[] lazyTree;
    
    void lazyAddition(int i,int l,int r,long val){
        long len=r-l+1;
        sqSumSegTree[i] =(sqSumSegTree[i] + 2 * val * sumSegTree[i]
        + len * val * val) % mod;

        sumSegTree[i] = (sumSegTree[i] + len * val) % mod;
    }

    void updateRange(int start, int end, int i,
                 int l, int r, long val) {

    if (lazyTree[i] != 0) {
        long pending = lazyTree[i];
        lazyAddition(i, l, r, pending);

        if (l != r) {
            lazyTree[2 * i + 1] =
                (lazyTree[2 * i + 1] + pending) % mod;
            lazyTree[2 * i + 2] =
                (lazyTree[2 * i + 2] + pending) % mod;
        }

        lazyTree[i] = 0;
    }
    if (l > end || r < start) {
        return;
    }

    if (start <= l && r <= end) {
        lazyAddition(i, l, r, val);

        if (l != r) {
            lazyTree[2 * i + 1] =
                (lazyTree[2 * i + 1] + val) % mod;
            lazyTree[2 * i + 2] =
                (lazyTree[2 * i + 2] + val) % mod;
        }

        return;
    }
    int mid = l + (r - l) / 2;

    updateRange(start, end, 2 * i + 1, l, mid, val);
    updateRange(start, end, 2 * i + 2, mid + 1, r, val);

    sumSegTree[i] =
        (sumSegTree[2 * i + 1] + sumSegTree[2 * i + 2]) % mod;

    sqSumSegTree[i] =
        (sqSumSegTree[2 * i + 1] + sqSumSegTree[2 * i + 2]) % mod;
}


    public int sumCounts(int[] nums) {
        n=nums.length;
        sqSumSegTree=new long[4*n];
        sumSegTree=new long[4*n];
        lazyTree=new long[4*n];

        int[] lastSeenIdx=new int[100001];
        java.util.Arrays.fill(lastSeenIdx,-1);
        long res=0;

        for(int i=0;i<n;i++){
            int start=lastSeenIdx[nums[i]]+1;
            int end=i;

            updateRange(start,end,0,0,n-1,1);
            res=(res+sqSumSegTree[0])%mod;

            lastSeenIdx[nums[i]]=i;
        }
        return (int)res;
    }
}
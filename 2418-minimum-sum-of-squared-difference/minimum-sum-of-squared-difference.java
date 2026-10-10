class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        long k=(long)k1+k2;
        int[] diff=new int[n];
        int max=0;
        long sumDiff=0;

        for(int i=0;i<n;i++){
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            max=Math.max(max,diff[i]);
            sumDiff+=diff[i];
        }
        if(sumDiff<=k) return 0;

        long[] freq=new long[max+1];

        for(int val:diff){
            freq[val]++;
        }

        for(int i=max;i>0 && k>0;i--){
            if(freq[i]==0) continue;

            if(k>=freq[i]){
                k-=freq[i];
                freq[i-1]+=freq[i];
                freq[i]=0;
            }else{
                freq[i]-=k;
                freq[i-1]+=k;
                k=0;
            }
        }
        long res=0;
        for(int i=0;i<=max;i++){
            res+=freq[i]*i*i;
        }
        return res;

    }
}
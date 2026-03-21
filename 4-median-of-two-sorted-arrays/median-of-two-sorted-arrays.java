class Solution {
    private int[] merge(int[] nums1,int[] nums2){
        int m=nums1.length;
        int n=nums2.length;
        int[] res= new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                res[k]=nums1[i];
                i++;
            }else{
                res[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            res[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            res[k]=nums2[j];
            j++;
            k++;
        }
        return res;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int m=nums1.length;
        // int n=nums2.length;
        int[] res= merge(nums1,nums2);
        // double low=0 , high = res[res.length-1];
        // while()
        int n=res.length;
        if(n%2!=0){
            return res[n/2];
        }
        return (res[(n - 1) / 2] + res[n / 2]) / 2.0;
    }
}

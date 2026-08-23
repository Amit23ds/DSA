class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res=new ArrayList<>();

        int l=0, h=arr.length-k;
        while(l<h){
            int mid=l+(h-l)/2;
            if(x-arr[mid] > arr[mid+k]-x){
                l=mid+1;
            }else{
                h=mid;
            }
        }
        for(int i=l;i<l+k;i++){
            res.add(arr[i]);
        }
        return res;
    }
}
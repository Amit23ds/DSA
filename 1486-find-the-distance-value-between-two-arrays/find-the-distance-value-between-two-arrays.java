class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt=0;
        for(int x:arr1){
            boolean flag=true;
            for(int y:arr2){
                if(Math.abs(y-x)<=d){
                    flag=false;
                    break;
                }
            }
            if(flag) cnt++;
        }
        return cnt;
    }
}
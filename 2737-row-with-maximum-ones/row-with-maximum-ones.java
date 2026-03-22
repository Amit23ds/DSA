class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int index = 0;
        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            int count = 0;

            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 1) count++;
            }

            if(count > ans){
                ans = count;
                index = i;
            }
        }

        return new int[]{index, ans};
    }
}
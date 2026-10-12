class Solution {
    public int candy(int[] ratings) {
        int peak=0;
        int down=0;
        int n=ratings.length;
        int sum=1, i=1;

        while(i<n){
            if(ratings[i]==ratings[i-1]){
                sum=sum+1;
                i++;
                continue;
            }
            peak=1;
            while(i<n && ratings[i]>ratings[i-1]){
                peak+=1;
                sum+=peak;
                i++;
            }
            down=1;
            while(i<n && ratings[i]<ratings[i-1]){
                sum+=down;
                down+=1;
                i++;
            }
            if(down>peak){
                sum+=down-peak;
            }
        }
        return sum;
    }
}
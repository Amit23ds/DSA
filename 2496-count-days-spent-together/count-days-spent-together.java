class Solution {
    int helper(String temp,int[] presum){
        int m=Integer.parseInt(temp.substring(0,2));
        int d=Integer.parseInt(temp.substring(3));
        if(m==1) return d;
        return presum[m-2]+d;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] presum={31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int[] month={31, 28, 31,  30,  31,  30,  31,  31,  30,  31,  30,  31};

        int aa=helper(arriveAlice,presum);
        int la=helper(leaveAlice,presum);

        int ab=helper(arriveBob,presum);
        int lb=helper(leaveBob,presum);

        int res=Math.min(lb,la)-Math.max(aa,ab)+1;
        if(res<0){
            return 0;
        }
        return res;
    }
}
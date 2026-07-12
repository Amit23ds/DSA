class Solution {

    int helper(String time){
        int n= time.length();
        String[] chars = time.split(":");

       int h= Integer.parseInt(chars[0]);
       int m= Integer.parseInt(chars[1]);
       int s= Integer.parseInt(chars[2]);

        return (h*60*60)+(m*60)+(s);

    }

    public int secondsBetweenTimes(String startTime, String endTime) {
        return helper(endTime)-helper(startTime);
    }
}
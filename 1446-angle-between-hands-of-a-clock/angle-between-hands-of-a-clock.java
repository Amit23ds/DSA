class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = Math.abs(6 * minutes - (30 * hour + 0.5 * minutes));
        return Math.min(angle, 360 - angle);
    }
}
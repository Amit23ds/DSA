class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int[] num:intervals){
            int st=num[0];
            int end=num[1];

            if(!pq.isEmpty() && pq.peek()<st){
                pq.poll();
            }
            pq.offer(end);
        }
        return pq.size();
    }
}
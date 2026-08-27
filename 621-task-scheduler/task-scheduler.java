class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        int cnt=0;

        for(char ch:tasks){
            freq[ch-'A']++;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int num:freq){
            if(num>0) pq.add(num);
        }

        while(!pq.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<=n;i++){
                if(!pq.isEmpty()){
                    int x=pq.remove()-1;
                    temp.add(x);
                    
                }
            }
            for(int val:temp){
                if(val>0){
                    pq.add(val);
                }    
            }
            if(pq.isEmpty()){
                cnt+=temp.size();
            }else{
                cnt+=n+1;
            }
        }
        return cnt;
    }
}
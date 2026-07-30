class Solution {
    public int minimumPushes(String word) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n =word.length();
        int assignKey=2;
        if(n<=8) return n;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(assignKey >9){
                assignKey=2;
            }
            hm.put(assignKey,hm.getOrDefault(assignKey,0)+1);
            cnt+=hm.get(assignKey);
            assignKey++; 
        }
        return cnt;
    }
}
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0) return false;
        
        TreeMap<Integer,Integer> hm =new TreeMap<>();
        for(int val:hand){
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        while(!hm.isEmpty()){
            int x=hm.firstKey();

            for(int i=0;i<groupSize;i++){
                if(!hm.containsKey(x+i)){
                    return false;
                }
                hm.put(x+i,hm.get(x+i)-1);
                if(hm.get(x+i)==0){
                    hm.remove(x+i);
                }
            }
        }
        return true;

    }
}
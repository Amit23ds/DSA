class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,HashSet<Integer>> hm=new HashMap<>();
        for(int[] seat:reservedSeats){
            int row=seat[0];
            int col=seat[1];
            hm.putIfAbsent(row,new HashSet<>());
            hm.get(row).add(col);
        }
        int ans=(n-hm.size())*2;
        for(HashSet<Integer> res:hm.values()){
            boolean l=true;
            boolean m=true;
            boolean r=true;
            for(int seat=2;seat<=5;seat++){
                if(res.contains(seat)){
                    l=false;
                    break;
                }
            }
            for(int seat=4;seat<=7;seat++){
                if(res.contains(seat)){
                    m=false;
                    break;
                }
            }
            for(int seat=6;seat<=9;seat++){
                if(res.contains(seat)){
                    r=false;
                    break;
                }
            }
            if(l && r) ans+=2;
            else if(l || r || m) ans+=1;
        }
        return ans;
    }
}
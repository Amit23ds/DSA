class Solution {
    public List<Integer> row(int n){
        List<Integer> list = new ArrayList<>();
        int ans =1;
        list.add(ans);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            list.add(ans);
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            res.add(row(i));
        }
        return res;
    }
}
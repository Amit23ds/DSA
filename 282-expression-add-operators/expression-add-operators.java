class Solution {
    List<String> res=new ArrayList<>();
    public List<String> addOperators(String num, int target) {
        helper(num,target,0,"",0,0);
        return res;
    }
    void helper(String num,long target,int idx,String st,long temp,long prev){
        if(idx>=num.length()){
            if(temp==target){
                res.add(st);
                return;
            }else{
                return;
            }
        }
        for(int i=idx;i<num.length();i++){
            if(i>idx && num.charAt(idx)=='0') return;
            String currSt=num.substring(idx,i+1);
            long curr=Long.parseLong(currSt);

            if(idx==0){
                helper(num,target,i+1,currSt,curr,curr); 
            }else{
                helper(num,target,i+1,st+"+"+currSt,temp+curr,curr);
                helper(num,target,i+1,st+"-"+currSt,temp-curr,-curr);
                helper(num,target,i+1,st+"*"+currSt,temp-prev+(prev*curr),prev*curr);
            }
        }
    }
}
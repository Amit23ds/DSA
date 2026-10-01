class Solution {
    public boolean lemonadeChange(int[] bills) {
        int cash5=0;
        int cash10=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                cash5++;
            }else if(bills[i]==10){ 
                if(cash5>0){
                    cash5--;
                }else{
                    return false;
                }
                cash10++;
            }else{
                if(cash10>0 && cash5>0){
                    cash10--;
                    cash5--;
                }else if(cash5>=3){
                    cash5-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
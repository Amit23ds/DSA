class Solution {
    public String intToRoman(int num) {
        int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] sym = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String res="";
        int temp=num;
        while(temp>0){
            for(int i=0;i<val.length;i++){
                if(temp-val[i]>=0){
                    res=res+sym[i];
                    temp=temp-val[i];
                    break;
                }
            }
        }
        return res;
        
    }
}
class Solution {
    public int totalWaviness(int num1, int num2) {
        int res=0;

        for(int i=num1;i<=num2;i++){
            String s = Integer.toString(i);
            for(int j=1;j<s.length()-1;j++){
                boolean peak = s.charAt(j)>s.charAt(j-1) && s.charAt(j)>s.charAt(j+1);
                boolean wave = s.charAt(j)<s.charAt(j-1) && s.charAt(j)<s.charAt(j+1);

                if(peak || wave) res++;
            }
        }
        return res;
    }
}
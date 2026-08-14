class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int i=prices.length-1,j=discounts.length-1;
        double d=0.0;
        while(i>=0 && j>=0){
            d+=(prices[i]*(100.00-discounts[j]))/100.00;
            i--;
            j--;
        }
        while(i>=0){
            d+=prices[i];
            i--;
        }
        return d;
    }
}
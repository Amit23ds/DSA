class Solution {
    private int reverse(int n){
        int r=0;
        while(n!=0){
            r=r*10+n%10;
            n/=10;
        }
        return r;
    }
    public boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    for (int i = 5; i <= Math.sqrt(n); i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false;
        }
    }
    return true;
    }   
    public int sumOfPrimesInRange(int n) {
        int r= reverse(n);
        int min = Math.min(n, r);
        int max = Math.max(n, r);
        int sum=0;
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
            sum += i;
            }
        }
        return sum;
    }
}
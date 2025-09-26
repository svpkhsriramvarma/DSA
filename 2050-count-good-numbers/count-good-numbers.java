class Solution {
    static long mod = 1_000_000_007;
    public static long findPow(long x,long n) {
        if(n == 0) return 1;

        long temp = findPow(x,n/2);

        if(n % 2 == 0)
            return (temp*temp)%mod;
        else
            return (x*temp*temp)%mod;
    }
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long evenPow = findPow(5,even)%mod;
        long oddPow = findPow(4,odd)%mod;

        return (int)((evenPow*oddPow) % mod);
    }
}
class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        long a=n;
        if(a<0){
            x=1/x;
            a=-a;
        }
        return power(x,a);
    }
    private double power(double x,long n){
        if (n == 0) {
            return 1;
        }

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return half * half * x;
    }
}
class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        } else {
            long exp = n;
            double result = calculatePower(x, exp >= 0 ? exp : -exp);
            return n >= 0 ? result : 1 / result;
        }
    }

    private double calculatePower(double num, long exp) {
        if (exp == 0)
            return 1;
        if (exp == 1)
            return num;

        double result = calculatePower(num, exp / 2);
        result = result * result;
        return (exp > 1) && (exp % 2 == 0) ? result : num * result;
    }
}
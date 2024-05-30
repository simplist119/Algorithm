import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        if(balls == share) return 1;
        return factorial(balls).divide(factorial(balls - share).multiply(factorial(share))).intValue();
    }

    public BigInteger factorial(int n) {
        if (n == 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
}
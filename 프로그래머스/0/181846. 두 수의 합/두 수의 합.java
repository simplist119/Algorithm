import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        // long보다 더 큰 숫자라서 BigInteger를 사용해야 했다.
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);

        return numA.add(numB).toString();
        
//        long numA = Integer.parseInt(a);
//        long numB = Integer.parseInt(b);
//
//        return numA + numB + "";
    }
}
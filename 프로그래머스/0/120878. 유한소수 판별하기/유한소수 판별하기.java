class Solution {
    public int solution(int a, int b) {
        int gcdNum = gcd(a, b);
        b /= gcdNum;
        while (b != 1) {
            if (b % 2 == 0) b /= 2;
            else if (b % 5 == 0) b /= 5;
            else return 2;
        }
        return 1;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
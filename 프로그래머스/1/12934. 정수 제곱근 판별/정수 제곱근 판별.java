class Solution {
    public long solution(long n) {
        long i = 0;
        while (true) {
            i++;
            if (i * i == n) {
                break;
            } else if (i * i > n) return -1;
        }
        return (long) Math.pow(i + 1, 2);
    }
}
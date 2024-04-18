class Solution {
    public long solution(int k, int d) {
        long count = 0;

        for (int i = 0; i <= d; i += k) {
            long dd = (long) d * d;
            long xx = (long) i * i;
            count += (long) (Math.sqrt(dd - xx) / k + 1);

        }
        return count;
    }
}
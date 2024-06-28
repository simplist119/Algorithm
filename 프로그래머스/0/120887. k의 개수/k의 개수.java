class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        for (int l = i; l <= j; l++) {
            int current = l;
            while (current > 0) {
                if (current % 10 == k) count++;
                current /= 10;
            }
        }
        return count;
    }
}
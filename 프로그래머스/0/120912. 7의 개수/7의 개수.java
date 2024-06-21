class Solution {
    public int solution(int[] array) {

        int count = 0;

        for (int i : array) {
            while (i > 0) {
                if (i % 10 == 7) count++;
                i /= 10;
            }
        }

        return count;
    }
}
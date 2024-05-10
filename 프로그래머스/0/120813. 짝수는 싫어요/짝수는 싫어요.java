class Solution {
    public int[] solution(int n) {
        int num = (int) ((double) n / 2 + 0.5);
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            answer[i] = 1 + i * 2;
        }
        return answer;
    }
}
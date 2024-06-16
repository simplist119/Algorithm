class Solution {
    public int solution(int[] array, int n) {
        int diff = Math.abs(array[0] - n);
        int answer = array[0]; 

        for (int i : array) {
            if(Math.abs(i-n) < diff) {
                answer = i;
                diff = Math.abs(i-n);
            }
            else if(Math.abs(i-n) == diff) answer = Math.min(i, answer);
        }

        return answer;
    }
}
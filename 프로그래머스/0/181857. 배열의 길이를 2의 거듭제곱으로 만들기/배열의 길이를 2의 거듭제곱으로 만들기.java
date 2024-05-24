class Solution {
    public int[] solution(int[] arr) {
        int x= 1;
        while (x < arr.length) {
            x *= 2;
        }
        int[] answer = new int[x];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }
}
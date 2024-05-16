class Solution {
    public int[] solution(int[] num_list) {
        // 데이터 원본은 그대로 두기 위해 배열 깊은 복사!
        int[] answer = num_list.clone();

        // 순서를 뒤집는데 처음부터 중간까지만 순회
        // 0 < i <= (num_list.length/2)-1 로 하면
        // num_list 의 길이가
        // 짝수일 때는 절반만큼 순회하고
        // 홀수일 때는 절반까지 가지않고 절반-1만큼 순회한다
        for (int i = 0; i <= answer.length / 2 - 1; i++) {
            int temp = answer[i];
            answer[i] = answer[answer.length-i-1];
            answer[answer.length-i-1] = temp;
        }
        return answer;
    }
}
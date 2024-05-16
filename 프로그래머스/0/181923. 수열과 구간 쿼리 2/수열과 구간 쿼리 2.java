class Solution {
   public int[] solution(int[] arr, int[][] queries) {
        // return값을 저장할 int 배열 생성
        // 사이즈는 queries의 1차원배열과 크기가 같아야 한다.
        int[] answer = new int[queries.length];

        // queries의 1차원 배열의 길이만큼 for문 돌리기
        for (int i = 0; i < queries.length; i++) {
            // answer 배열을 -1로 초기화
            answer[i] = -1;
            // s~e만큼 for문 돌리기
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                // arr[j]값이 k보다 클 때
                if (arr[j] > queries[i][2]) {
                    // 제일 처음 조건을 만족하는경우
                    if (answer[i] == -1) answer[i] = arr[j];
                    // 조건을 만족하면서 이전의 경우보다 더 적은수인 경우 계속 answer[i]를 교체
                    if (answer[i] > arr[j]) answer[i] = arr[j];
                }
            }
        }
        return answer;
    }
}
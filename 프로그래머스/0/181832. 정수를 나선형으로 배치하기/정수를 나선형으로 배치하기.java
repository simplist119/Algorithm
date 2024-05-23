// 수식을 세워서는 문제를 풀지 못할 것 같아서
// 무식하게 풀었다.
// 방향을 정하고 순서대로 값을 넣어주다가 다음 자리에 값이 있으면 방향을 바꾸는 방법
// (방향의 순서는 오른쪽r, 아래d, 왼쪽l, 위u)
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        char direction = 'r';
        int up_max = 1;
        int down_max = n - 1;
        int left_max = 0;
        int right_max = n - 1;
        int i = 0, j = 0, k = 1;

        while (k <= n * n) {
            answer[i][j] = k++;
            if (direction == 'r') {
                if (j != right_max) j++;
                else {
                    right_max--;
                    direction = 'd';
                    i++;
                }
            } else if (direction == 'd') {
                if (i != down_max) i++;
                else {
                    down_max--;
                    direction = 'l';
                    j--;
                }
            } else if (direction == 'l') {
                if (j != left_max) j--;
                else {
                    left_max++;
                    direction = 'u';
                    i--;
                }
            } else if (direction == 'u') {
                if (i != up_max) i--;
                else {
                    up_max++;
                    direction = 'r';
                    j++;
                }
            }
        }
        return answer;
    }
}
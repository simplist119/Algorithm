import java.util.*;

// 가장 큰수를 가장 적은 횟수로, 가장 작은수를 가장 많은 횟수로 곱해주면 되므로
// 한개는 오름차순 정렬, 한개는 내림차순 정렬을 해서 곱해주면 된다.
class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length-1-i];
        }
        
        return answer;
    }
}
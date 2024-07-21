import java.util.*;

// 완전탐색 : 가능한 모든 경우의 수를 다 체크해서 정답을 찾는 것.
// yellow 약수 찾아서 ArrayList에 담기
// 가로가 세로보다 길거나 같음 고려할 것.

// (노란색가로 + 2) * 2 + 노란색세로 * 2 = 브라운 총 갯수
// 노란색가로 * 2 + (노란색세로 + 2) * 2 = 브라운 총 갯수
// 2 * ( 노란색가로 + 노란색세로 + 2) = 브라운 총 갯수
class Solution {
    public int[] solution(int brown, int yellow) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[]{-1,-1};
        
        //약수 찾기, 가로 값 먼저 넣어주기
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if(yellow%i==0) {
                list.add(yellow/i);
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i=i+2) {
            int width = list.get(i);
            int height = list.get(i+1);
            if(brown == 2*(width+height+2)){
                answer[0] = width + 2;
                answer[1] = height + 2;
            }
        }
        return answer;
    }
}

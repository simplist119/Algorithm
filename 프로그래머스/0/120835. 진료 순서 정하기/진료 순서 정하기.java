import java.util.*;

// 이번 문제는 map을 이용해서 풀어 보려고한다.
// int 배열인 emergency를 Integer 배열인 temp에 깊은 복사. int -> Integer 과정을 박싱이라 한다. 
// temp를 내림차순 정렬한다.
// 맵 생성하고 temp[i] : i+1로 add

// 문제가 요구하는 답을 제출하기 위해선 temp가 아닌 원본인 emergency를 순서대로 돌면서
// map을 조회하고 value를 result 배열에 순서대로 추가한다.
class Solution {
    public int[] solution(int[] emergency) {

        Integer[] temp = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < emergency.length; i++) {
            map.put(temp[i], i + 1);
        }

        int[] answer = new int[emergency.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = map.get(emergency[i]);
        }

        return answer;
    }
}
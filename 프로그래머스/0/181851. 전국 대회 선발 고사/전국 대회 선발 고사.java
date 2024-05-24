import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        // 참가 가능한 학생들의 등수만 arraylist에 저장한다.
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < attendance.length; i++) {
            if(attendance[i]) list.add(rank[i]);
        }
        
        // 리스트를 오름차순으로 정렬한다.
        list = list.stream().sorted().collect(Collectors.toList());

        // 상위 3명이 rank배열의 몇번째에 위치하는지 찾아서 answer 배열에 저장한다.
        int[] answer = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < rank.length; j++) {
                if(list.get(i) == rank[j]) {
                    answer[i] = j;
                    break;
                }
            }
        }

        // 결과식을 작성한다.
        return 10000*answer[0] + 100*answer[1] + answer[2];

    }
}
// 프로그래머스 기초 문제 끝~
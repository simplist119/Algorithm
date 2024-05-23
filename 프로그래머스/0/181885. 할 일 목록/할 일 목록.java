import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 결과값을 예상할 수 없으므로 먼저 크기가 가변적인 ArrayList 생성
        List<String> list = new ArrayList<>();

        // finished를 순회하면서 false이면 해당 index를 todo_list에 대입해서 그 값을 ArrayList에 add
        for (int i = 0; i < finished.length; i++) {
            if(!finished[i]) list.add(todo_list[i]);
        }

        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}
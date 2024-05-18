import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 재귀함수를 써보고 싶었다.
class Solution {
    public int[] solution(int n) {
        // 먼저 결과물의 사이즈를 모르니 ArrayList로 결과값을 저장하자.
        List<Integer> list = new ArrayList<>();
        
        // list의 첫번째 요소에 n값을 넣어준다.
        list.add(n);
        
        // 내가 만든 재귀함수를 호출
        // 기본형 변수가 아닌 참조형 변수를 매개변수로 넘겨주면
        // 해당 매개변수의 주소값을 넘겨주는 것이므로 같은 인스턴스를 
        // 계속 핑퐁??(참조) 한다고 생각하면 된다.
        // colatz함수를 호출했으니 colatz 함수를 살펴보고 오자.
        colatz(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    // 이 문제를 보고 재귀함수를 써보면 되겠다 싶어서 재귀함수를 구현해 보았다.
    public List<Integer> colatz(List<Integer> list) {
        
        // 콜라츠 수열 자체가 마지막 숫자를 기준으로 계속 계산해 나가는 수열이다.
        // 따라서 마지막 값을 먼저 구하자.
        int last = list.get(list.size() - 1);
        
        // 마지막 값이 1이면 콜라츠 수열이 완료된 것이다.
        // return 문을 실행해서 main함수로 돌아가고 재귀함수를 끝낸다.
        if (last == 1) return list;
        
        // 마지막값이 아직 1이 아닌 경우는 계속 짝수인지 홀수인지 판단해서
        // 수식을 더 진행해야 한다.
        // 자신과 같은 colatz() 함수를 return 문에서 실행시킴으로서
        // 재귀함수가 호출된다.
        if (last % 2 == 0) list.add(last / 2);
        else list.add(3 * last + 1);
        return colatz(list);
    }
}
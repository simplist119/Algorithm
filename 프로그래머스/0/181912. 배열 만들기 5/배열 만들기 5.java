import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        // 조건을 만족하는 값을 담을 배열의 크기를 예측할 수 없으므로
        // 크기가 가변적인 ArraysList 생성
        List<Integer> list = new ArrayList<>();

        // 매개변수로 받은 inStrs를 순회하면서 조건을 만족하면 ArrayList에 add
        for (String intStr : intStrs) {
            int tmp = Integer.parseInt(intStr.substring(s, s + l));
            if(tmp > k) list.add(tmp);
        }

        // Integer 타입의 ArrayList는 toArray() 메서드를 사용할 수 없다.
        // String 타입은 가능
        // 그래서 int[] 배열에 옮겨담으려면 stream을 사용하거나 직접 넣어줘야한다.
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return  answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int n) {

        // 3진법으로 변환, ArrayList에 담기
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 3);
            n /= 3;
        }

        int answer = 0;
        int power = 0;
        Collections.reverse(list);
        for (Integer i : list) {
            answer = answer + i * (int) Math.pow(3, power);
            power++;
        }
        
        return answer;
    }

}
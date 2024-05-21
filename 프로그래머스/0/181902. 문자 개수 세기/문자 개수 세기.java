import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // A~Z, a~z 의 갯수인 52만큼 배열 생성
        int[] answer = new int[52];
        
        // 매개변수로 건네받은 my_string을 한개의 문자씩 순회
        // 대문자인 경우와 소문자인 경우를 나눠서 생각한다.
        // 대문자인 경우 아스키코드 'A' 값을 빼주면 몇번째 대문자인지 알 수 있고,
        // 소문자인 경우 아스키코드 'a' 값을 빼주면 몇번째 소문자인지 알 수 있다.
        // 또한, 소문자는 26번째 배열부터 넣어줄 것이므로 소문자의 경우 index에 26을 더해준다.
        for (Character c : my_string.toCharArray()) {
            if(Character.isUpperCase(c)) answer[c-'A']++;
            else  answer[c-'a'+26]++;
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        // StringTokenizer를 이용해서 문자열을 토큰화
        // 생성자에 매개변수가 3개까지 올 수 있는데
        // 1개만 들어올 때는 문자열
        // 2개가 들어올 때는 문자열, 구분자 (delimiter)
        // 3개가 들어올 때는 문자열, 구분자, 구분자도 토큰화시킬건지 true|false.
        // default는 false이다.
        StringTokenizer st = new StringTokenizer(my_string);
        String[] arr = new String[st.countTokens()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken();
        }
        return arr;
    }
}
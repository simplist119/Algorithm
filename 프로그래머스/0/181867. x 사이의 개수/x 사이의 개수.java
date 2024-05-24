import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        int[] answer = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            answer[i] = str[i].length();
        }
        if(myString.charAt(myString.length()-1) == 'x') {
            int[] answer2 = new int[answer.length + 1];
            answer2 = Arrays.copyOfRange(answer, 0, answer2.length);
            return answer2;
        }

        return answer;
    }
}
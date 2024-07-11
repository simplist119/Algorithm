import java.util.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] temp = str.toCharArray();
        Character[] answer = new Character[temp.length];
        for (int i = 0; i < temp.length; i++) {
            answer[i] = temp[i];
        }
        Arrays.sort(answer, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Character c : answer) {
            sb.append(c);
        }
        return Long.valueOf(sb.toString());
    }
}
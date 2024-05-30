import java.util.*;

class Solution {
    public int[] solution(String my_string) {

        List<Integer> list = new ArrayList<>();

        char[] chars = my_string.toCharArray();
        for (char ch : chars) {
            if (ch >= '0' && ch <= '9') list.add(ch - '0');
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
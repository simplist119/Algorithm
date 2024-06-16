import java.util.*;

class Solution {
    public int solution(String s) {
        String[] words = s.split(" ");
        int prev = 0;
        int answer = 0;
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            if(word.equals("Z")) stack.pop();
            else stack.push(word);
        }

        for (String string : stack) {
            answer += Integer.parseInt(string);
        }

        return answer;
    }
}
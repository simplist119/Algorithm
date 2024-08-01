import java.util.*;

class Solution {
    public int solution(String s) {
        // 문자열을 char 배열로 치환
        // 스택 생성
        // 배열 순회하면서 스택이 비어있다면 push하고 continue

        // 비어있지 않다면
        // stack.peek와 비교해보고
        // 같다면 stack pop하고 continue
        // 같지 않다면 push하고 continue

        // for문을 끝내고 stack이 isempty라면 return 1 아니면 0
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char ch : chars) {
            if (stack.isEmpty()) stack.push(ch);
            else {
                if (ch == stack.peek()) stack.pop();
                else {
                    stack.push(ch);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='(') stack.push(c);
            if(c==')') {
                if(!stack.isEmpty()) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
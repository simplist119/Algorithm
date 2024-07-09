import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if(!stack.isEmpty()){
                if(i == stack.peek()) continue;
                else stack.push(i);
            } else stack.push(i);
        }
        return stack.stream().mapToInt(i->i).toArray();
    }
}
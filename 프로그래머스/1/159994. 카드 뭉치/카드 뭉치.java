import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();

        for (String s1 : cards1) {
            q1.offer(s1);
        }
        for (String s2 : cards2) {
            q2.offer(s2);
        }

        for (String s : goal) {
            if (!q1.isEmpty() && q1.peek().equals(s)) {
                q1.poll();
            } else if (!q2.isEmpty() && q2.peek().equals(s)) {
                q2.poll();
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
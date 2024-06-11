import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }

        int[] answer = set.stream().mapToInt(k -> k).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
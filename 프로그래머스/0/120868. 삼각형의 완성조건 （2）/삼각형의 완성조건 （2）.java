import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= sides[1]; i++) {
            if (i + sides[0] > sides[1]) set.add(i);
        }

        for (int i = sides[1]; i <= sides[0] + sides[1]; i++) {
            if (sides[0] + sides[1] > i) set.add(i);
        }

        return set.size();
    }
}
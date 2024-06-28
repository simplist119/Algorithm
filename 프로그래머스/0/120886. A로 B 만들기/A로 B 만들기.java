import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] chars1 = before.toCharArray();
        char[] chars2 = after.toCharArray();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : chars1) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : chars2) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        
        if(map1.equals(map2)) return 1;
        return 0;
    }
}
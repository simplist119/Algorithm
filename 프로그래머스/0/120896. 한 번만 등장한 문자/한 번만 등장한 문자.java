import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c : map.keySet()) {
            if(map.get(c) == 1) sb.append(c);
        }

        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}
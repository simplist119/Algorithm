import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new LinkedHashSet<>();
        char[] chars = my_string.toCharArray();

        for (char c : chars) {
            set.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        for(Character c : set){
            sb.append(c);
        }

        return sb.toString();
    }
}
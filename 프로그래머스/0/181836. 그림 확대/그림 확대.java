import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < picture.length; i++) {
            String temp = picture[i];
            temp = temp.replaceAll("\\.", "\\.".repeat(k));
            temp = temp.replaceAll("x", "x".repeat(k));
            for (int j = 0; j < k; j++) {
                list.add(temp);
            }
        }

        return list.toArray(new String[0]);
    }
}


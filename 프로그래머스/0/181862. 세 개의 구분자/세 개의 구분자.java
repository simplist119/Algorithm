import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace('a', ' ');
        myStr = myStr.replace('b', ' ');
        myStr = myStr.replace('c', ' ');

        String[] abc = myStr.split(" ");
        List<String> list = new ArrayList<>();

        for (String s : abc) {
            if(!s.isEmpty()) list.add(s);
        }

        String[] answer = list.toArray(new String[0]);
        if(answer.length == 0) return new String[]{"EMPTY"};
        return answer;
    }
}
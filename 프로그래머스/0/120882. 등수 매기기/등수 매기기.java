import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            list.add(score[i][0] + score[i][1]);
        }
        list.sort(Comparator.reverseOrder());

        int[] result = new int[score.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
        }
        return result;
    }
}
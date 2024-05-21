import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] tmp1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1]+1);
        int[] tmp2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1]+1);
        int[] answer = new int[tmp1.length + tmp2.length];

        System.arraycopy(tmp1, 0, answer, 0, tmp1.length);
        System.arraycopy(tmp2, 0, answer, tmp1.length, tmp2.length);
        
        return answer;
    }
}
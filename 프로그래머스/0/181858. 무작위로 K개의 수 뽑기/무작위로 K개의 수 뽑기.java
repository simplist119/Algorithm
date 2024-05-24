import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] temp = Arrays.stream(arr).distinct().toArray();
        int[] result = new int[k];
        Arrays.fill(result, -1);

        for (int i = 0; i < Math.min(temp.length, k); i++) {
            result[i] = temp[i];
        }
        
        return result;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = f1(array, commands[i][0], commands[i][1], commands[i][2]);
        }
        return answer;
    }
    
    int f1(int[] arr, int a, int b, int c){
        int[] temp = Arrays.copyOfRange(arr, a-1, b);
        Arrays.sort(temp);
        return temp[c-1];
    }
}
class Solution {
    public int[] solution(int[] array) {
        int max_num = 0;
        int idx = -1;
        int[] answer = new int[2];

        for (int i : array) {
            if (i > max_num) max_num = i;
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] == max_num) idx = i;
        }
        
        answer[0] = max_num;
        answer[1] = idx;
        return answer;
    }
}
class Solution {
    public int solution(int[] array) {
        // array 원소의 크기가 0 <= array < 1000이므로
        // array에 어떤 숫자가 몇번 나오는지 카운트하기위해
        // 1000크기의 int 배열 생성하고 카운팅
        int[] answer = new int[1000];
        for (int i = 0; i < array.length; i++) {
            answer[array[i]]++;
        }

        // answer 배열을 순회하면서 가장 큰 숫자를 찾고
        // 그 숫자가 2회이상 나오는지 판단
        int max_num = answer[0];
        int count = 1;
        int real_answer = 0;
        
        for (int j = 1; j < answer.length; j++) {
            if (answer[j] > max_num) {
                max_num = answer[j];
                real_answer = j;
                count = 1;
            } else if (answer[j] == max_num) {
                count++;
            }
        }
        if (count >= 2) return -1;
        else return real_answer;
    }
}
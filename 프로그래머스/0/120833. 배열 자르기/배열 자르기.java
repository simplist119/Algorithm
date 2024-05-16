class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        //num2-num1 만큼 크기의 정답을 담을 배열 생성
        int range = num2-num1+1;
        int[] answer = new int[range];
        
        // answer배열에 numbers배열의 일정 구간을 대입한다.
        for(int i=0; i<range; i++){
            answer[i] = numbers[num1+i];
        }
        
        return answer;
    }
}
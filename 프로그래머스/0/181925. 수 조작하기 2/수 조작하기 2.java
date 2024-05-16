class Solution {
    public String solution(int[] numLog) {
        // 결과를 저장할 StringBuilder 생성
        // String 타입으로 문자열을 다루지 않는 이유는
        // 문자열 연산을 여러번 할 때, StringBuilder가 
        // 비용적으로 더 유리하기 때문
        StringBuilder sb = new StringBuilder();

        // 배열 numLog를 순회하면서 연속된 두 배열의 차이를 계산하고
        // 그 결과에 따라 if문 작성
        for(int i=1; i<numLog.length; i++){
            int diff = numLog[i] - numLog[i-1];
            if(diff == 1) sb.append('w');
            else if(diff == -1) sb.append('s');
            else if(diff == 10) sb.append('d');
            else if(diff == -10) sb.append('a');
        }
        
        return sb.toString();
    }
}
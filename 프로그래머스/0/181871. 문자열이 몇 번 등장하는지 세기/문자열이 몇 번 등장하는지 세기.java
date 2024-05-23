class Solution {
    public int solution(String myString, String pat) {
        // String.indexOf() 메서드 사용하기
        // strA.indexOf(strB, int) 메서드는
        // strB가 int이후로 처음 등장하는 위치를 반환, 없다면 -1

        int answer = 0;
        int idx = 0;

        while((idx = myString.indexOf(pat, idx)) != -1){
            answer++;
            idx++;
        }
        
        return answer;
    }
}
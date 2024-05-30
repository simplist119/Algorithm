class Solution {
    public String solution(String letter) {
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
                ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        
        // letter의 각 문자가 공백으로 구분되어 있다고 문제에 나와있어서 공백을 기준으로 split 해주기
        String[] temp = letter.split(" ");
        
        // 정답문자열을 담을 StringBuilder 생성
        StringBuilder sb = new StringBuilder();

        // 먼저 편지내용이 담긴 temp를 순회하면서 모스부호와 비교.
        // 일치하면 StringBuilder에 알파벳 추가하기
        for (String s : temp) {
            for (int i = 0; i < morse.length; i++) {
                if(s.equals(morse[i])){
                    // 형변환을 하지 않으면 알파벳이 아닌 숫자가 StringBuilder에 추가됨.
                    sb.append((char)('a'+i));
                    break;
                }
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}
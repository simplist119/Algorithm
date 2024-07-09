class Solution {
    public String solution(String[] seoul) {
        int idx = 0;
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) idx = i;
        }
        String answer = "김서방은 x에 있다";
        answer = answer.replace("x", String.valueOf(idx));
        return answer;
    }
}
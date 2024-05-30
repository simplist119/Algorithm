class Solution {
    public int solution(int n) {
        
        String temp = "" + n;
        int answer = 0;

        for (char c : temp.toCharArray()) {
            answer += c - '0';
        }

        return answer;
    }
}
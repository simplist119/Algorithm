class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] ch = my_string.toCharArray();
        for (char c : ch) {
            if(c >= '0' && c <= '9') answer += Integer.parseInt(String.valueOf(c));
        }
        return answer;
    }
}
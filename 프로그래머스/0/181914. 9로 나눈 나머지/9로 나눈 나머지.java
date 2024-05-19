class Solution {
    public int solution(String number) {
        char[] ch = number.toCharArray();
        int sum = 0;
        int answer = 0;
        for (char c : ch) {
            System.out.print(c);
            sum += (c-'0');
        }
        answer = sum%9;
        return answer;
    }
}
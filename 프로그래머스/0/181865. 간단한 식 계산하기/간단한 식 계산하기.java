class Solution {
    public int solution(String binomial) {
        int answer = 0;
        char sign = ' ';
        int x = 0;
        for (int i = 0; i < binomial.length(); i++) {
            if (binomial.charAt(i) == ' ') {
                sign = binomial.charAt(i + 1);
                x = i;
                break;
            }
        }

        int a = Integer.parseInt(binomial.substring(0, x));
        int b = Integer.parseInt(binomial.substring(x + 3));

        if (sign == '+') answer = a + b;
        else if (sign == '-') answer = a - b;
        else if (sign == '*') answer = a * b;
        return answer;
    }
}
class Solution {
    public String solution(String phone_number) {

        char[] temp = phone_number.toCharArray();

        for (int i = 0; i < temp.length - 4; i++) {
            temp[i] = '*';
        }

        StringBuilder sb = new StringBuilder();
        for (char c : temp) {
            sb.append(c);
        }
        
        String answer = sb.toString();
        return answer;

    }
}
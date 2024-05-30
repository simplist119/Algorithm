class Solution {
    public String solution(String my_string) {

        StringBuilder sb = new StringBuilder();
        String answer = "";
        char[] chars = my_string.toCharArray();

        for (char ch : chars) {
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') sb.append(ch);
        }

        answer = sb.toString();
        return answer;
    }
}
class Solution {
    public int solution(String s) {
        String[] words = s.split(" ");
        int prev = 0;
        int answer = 0;

        for (String word : words) {
            if(word.equals("Z")) answer -= prev;
            else {
                answer += Integer.parseInt(word);
                prev = Integer.parseInt(word);
            }
        }
        
        return answer;
    }
}
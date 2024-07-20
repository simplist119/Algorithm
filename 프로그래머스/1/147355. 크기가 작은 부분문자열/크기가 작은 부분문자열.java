class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long temp = Long.parseLong(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.parseLong(t.substring(i, p.length() + i)) <= temp) answer++;
        }
        return answer;
    }
}
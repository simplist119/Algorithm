class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String s : babbling) {
            String temp = s.replaceAll("aya|ye|woo|ma", "");
            if(temp.isEmpty()) answer++; 
        }
        
        return answer;
    }
}
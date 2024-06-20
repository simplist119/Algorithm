class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i=0; i<quiz.length; i++){
            String[] strTemp = quiz[i].split(" ");
            int answerTemp = 0;
            
            if(strTemp[1].equals("+")) answerTemp = Integer.parseInt(strTemp[0]) + Integer.parseInt(strTemp[2]);
            else if(strTemp[1].equals("-")) answerTemp = Integer.parseInt(strTemp[0]) - Integer.parseInt(strTemp[2]);
            
            if(answerTemp == Integer.parseInt(strTemp[strTemp.length-1])) answer[i] = "O";
            else answer[i] = "X";
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] result = {0, 0};
        for (String s : keyinput) {
            if (s.equals("left") && result[0] != -board[0] / 2) result[0]--;
            else if (s.equals("right") && result[0] != board[0] / 2) result[0]++;
            else if (s.equals("up") && result[1] != board[1] / 2) result[1]++;
            else if (s.equals("down") && result[1] != -board[1] / 2) result[1]--;
        }
        return result;
    }
}
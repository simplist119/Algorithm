// 두가지 방법을 떠올렸다.
// 2차원 배열의 사이즈만큼 for문을 돌면서
// 1) 주변에 지뢰가 있는지 체크하고 카운트를 셀 것인지
// 2) 아니면 해당 위치가 지뢰인지 판단하고
//    위험지역을 2라는 값으로 새로 쓰고 0값만 카운트 할 것인지
// 여러번 값을 읽어오는 것보다 새로 쓰는게 더 빠를 것 같아서 2번으로 골랐다.

class Solution {
    public int solution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    if(i!=0 && j!=0 && board[i-1][j-1]==0) board[i-1][j-1] = 2;
                    if(i!=0 && board[i-1][j] ==0) board[i-1][j] = 2;
                    if(i!=0 && j!= board[i].length-1 && board[i-1][j+1]==0) board[i-1][j+1] = 2;
                    if(j!=board[i].length-1 && board[i][j+1]==0) board[i][j+1] = 2;
                    if(i!=board.length-1 && j!=board[i].length-1 && board[i+1][j+1] ==0) board[i+1][j+1] = 2;
                    if(i!= board.length-1 && board[i+1][j]==0) board[i+1][j] = 2;
                    if(i!=board.length-1 && j !=0 && board[i+1][j-1]==0) board[i+1][j-1] = 2;
                    if(j!=0 && board[i][j-1]==0) board[i][j-1] = 2;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]==0) count++;
            }
        }
        return count;
    }
}
import java.util.*;

// xy좌표 평면의 직사각형이므로 x좌표의 최소,최대값, y좌표의 최소,최대값을 구하면 넓이를 구할 수 있다.
// 주어진 좌표들을 x좌표는 x좌표끼리 y좌표는 y좌표끼리 모아준다.
// 값이 2개가 아니라 4개라서 Math.max , Math.min을 사용할 수 없으므로 배열을 정렬해서 구하자.
// 배열을 정렬하면 최소값과 최대값을 구할 수 있다.
// ( x최대 - x최소 ) * ( y최대 - y최소 ) = 직사각형의 넓이
class Solution {
    public int solution(int[][] dots) {
        int[] xDots = new int[4];
        int[] yDots = new int[4];

        for (int i = 0; i < 4; i++) {
            xDots[i] = dots[i][0];
            yDots[i] = dots[i][1];
        }

        Arrays.sort(xDots);
        Arrays.sort(yDots);

        return (xDots[3] - xDots[0]) * (yDots[3] - yDots[0]);
    }
}
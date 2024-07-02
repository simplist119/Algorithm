import java.util.*;

// 점 4개로 2개씩 순서상관없이 조합하는 경우의 수 모아서 3개 경우의 수를 만들고
// 각각의 경우의 수에서 선분들의 기울기를 구하고 기울기가 같으면 1 return
// 기울기를 구하기 위해선 기약분수로 만들어야하기 때문에 약분한다.
// double이나 float은 오차가 있으니 이럴때는 사용하지 않는 것이 좋을 것 같다.
class Solution {
    public int solution(int[][] dots) {
        // 3가지 경우의 수 만들어 놓기
        int[][][] cases = new int[3][4][2];
        for (int i = 0; i < cases.length; i++) {
            int[] temp = dots[1];
            dots[1] = dots[i + 1];
            dots[i + 1] = temp;
            System.arraycopy(dots, 0, cases[i], 0, dots.length);
        }
        System.out.println(Arrays.deepToString(cases));

        // 선분 A,B의 기울기를 구하고 약분하기
        // 분수로 적어놓을 수 없으니 각 선분의 X,Y길이를 구해 놓았다.
        for (int[][] c : cases) {
            int lineAX = c[0][0] - c[1][0];
            int lineAY = c[0][1] - c[1][1];
            int lineBX = c[2][0] - c[3][0];
            int lineBY = c[2][1] - c[3][1];

            int gcdA = GCD(Math.abs(lineAX), Math.abs(lineAY));
            int gcdB = GCD(Math.abs(lineBX), Math.abs(lineBY));

            lineAX /= gcdA;
            lineAY /= gcdA;
            lineBX /= gcdB;
            lineBY /= gcdB;

            if (lineAX == lineBX && lineAY == lineBY) return 1;
            if (lineAX == -lineBX && lineAY == -lineBY) return 1;
        }
        return 0;
    }

    // 최대공약수를 구하는 함수
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
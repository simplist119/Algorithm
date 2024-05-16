class Solution {
    public int solution(int n) {
        // 문제
        // 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
        // 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
        // n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
        // 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.

        // 문제는 최소공배수를 구한 다음 한판당 피자조각수인 6으로 나눠주면 된다.
        int answer = lcm(6, n) / 6;
        return answer;
    }

    public int lcm(int a, int b) {

        // for문을 작성하기 위해 매개변수 a,b 중 큰수와 작은수를 판단한다.
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // 먼저 최소공배수를 두 수의 곱으로 정해놓고
        // 그보다 작은 최소공배수를 찾는다.
        int temp = max * min;
        for (int i = 1; i < min; i++) {
            if (max * i % min == 0) {
                temp = max * i;
                break;
            }
        }
        return temp;
    }
}
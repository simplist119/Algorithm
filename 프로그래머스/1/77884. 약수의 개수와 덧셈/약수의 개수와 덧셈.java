// 약수의 개수가 홀수이면 완전 제곱수이다.
class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            if (i == Math.pow((int)Math.sqrt(i), 2)) sum -= i;
            else sum += i;
            System.out.println("sum = " + sum);
        }

        return sum;
    }
}
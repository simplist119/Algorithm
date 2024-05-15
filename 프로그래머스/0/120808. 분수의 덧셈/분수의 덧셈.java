class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분수 덧셈 계산 하기
        int denom3 = denom1 * denom2;
        int numer3 = numer1 * denom2 + numer2 * denom1;

        // 분자와 분모중 작은쪽만큼만 for문 돌기 위해서
        // 더 작은수를 찾고 최대공약수를 저장할 변수 생성
        int smaller = Math.min(denom3, numer3);
        int common_divisor = 1;

        // 최대공약수 찾기
        for(int i=2; i<=smaller; i++){
            if(denom3%i==0 && numer3%i==0){
                common_divisor = i;
            }
        }

        // 최대공약수로 약분
        denom3 /= common_divisor;
        numer3 /= common_divisor;

        return new int[]{numer3, denom3};
    }
}
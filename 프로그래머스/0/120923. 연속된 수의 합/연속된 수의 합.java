// 연속된 숫자이므로 차가 1인 등차수열을 반환해야한다.
// 등차수열을 합을 구하는 공식은
// 합 = 항의 갯수 * (( 첫번째 항 + 마지막 항) / 2)
// total = num * (( 첫번째 항 + 마지막 항) / 2)

// last - first = num - 1
// last + first = total * 2 / num
// +
// 2last = (num-1) + (total*2/num)
// last = ((num-1) + (total*2/num)) / 2

class Solution {
    public int[] solution(int num, int total) {
        int last = ((num - 1) + (total * 2 / num)) / 2;

        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            result[i] = last - num + 1 + i;
        }
        
        return result;
    }
}
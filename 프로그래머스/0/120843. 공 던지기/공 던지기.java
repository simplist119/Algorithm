class Solution {
    public int solution(int[] numbers, int k) {
        int temp = ((2 * k) -1) % numbers.length;
        if(temp==0) return numbers[numbers.length - 1];
        return numbers[temp-1];
    }
}
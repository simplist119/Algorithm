class Solution {
    public int[] solution(int n, int k) {
        int size = n / k;
        int[] intArr = new int[size];

        for (int i = 0; i < size; i++) {
            intArr[i] = k*(i+1);
        }
        return  intArr;
    }
}
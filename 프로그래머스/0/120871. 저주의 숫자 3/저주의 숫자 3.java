class Solution {
    public int solution(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result++;
            while(String.valueOf(result).contains("3") || result % 3 == 0) {
                result++;
            }
        }
        System.out.println(result);
        return result;
    }
}
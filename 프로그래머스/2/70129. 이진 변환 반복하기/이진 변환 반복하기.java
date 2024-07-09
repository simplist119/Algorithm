class Solution {
    public int[] solution(String s) {
        int zeroCount = 0;
        int whileCount = 0;

        while (!s.equals("1")) {
            int oneCount = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') oneCount++;
                else zeroCount++;
            }
            s = Integer.toBinaryString(oneCount);
            whileCount++;
        }

        return new int[]{whileCount, zeroCount};
    }
}
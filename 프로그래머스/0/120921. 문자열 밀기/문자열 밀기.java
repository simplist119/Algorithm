class Solution {
    public int solution(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            if(A.equals(B)) return i;
            A = shiftR(A);
        }
        return -1;
    }

    public String shiftR(String str) {
        String temp = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
        return temp;
    }
}

class Solution {
    public int solution(String myString, String pat) {
        String tmp = pat;
        tmp = pat.replaceAll("A", "C").replaceAll("B", "A").replaceAll("C", "B");
        if (myString.contains(tmp)) return 1;
        else return 0;
    }
}
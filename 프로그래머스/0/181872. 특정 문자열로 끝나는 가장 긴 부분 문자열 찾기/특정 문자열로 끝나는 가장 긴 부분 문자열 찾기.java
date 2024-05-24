class Solution {
    public String solution(String myString, String pat) {
        int x = myString.lastIndexOf(pat);
        return myString.substring(0, x+pat.length());
    }
}
class Solution {
    public String solution(String rsp) {
        String temp = "";
        temp = rsp.replaceAll("2", " ");
        temp = temp.replaceAll("5", "2");
        temp = temp.replaceAll("0", "5");
        temp = temp.replaceAll(" ", "0");
        return temp;
    }
}
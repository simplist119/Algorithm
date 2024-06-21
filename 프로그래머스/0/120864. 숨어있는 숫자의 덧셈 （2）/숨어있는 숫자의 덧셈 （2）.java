class Solution {
    public int solution(String my_string) {
        int sum = 0;

        String temp = my_string.replaceAll("[a-zA-Z]", "+");
        String[] arr = temp.split("\\+");

        for (String s : arr) {
            if(!s.isEmpty()) sum += Integer.parseInt(s);
        }

        return sum;
    }
}
class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int height = my_string.length()/m;
        for(int i=0; i<height; i++){
            char ch = my_string.charAt(c-1 + m*i);
            sb.append(ch);
        }
        return sb.toString();
    }
}
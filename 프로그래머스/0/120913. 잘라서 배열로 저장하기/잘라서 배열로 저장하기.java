class Solution {
    public String[] solution(String my_str, int n) {
        String[] result = new String[my_str.length()/n + (my_str.length()%n==0?0:1)];
        for (int i = 0; i < result.length; i++) {
            if((i+1)*n>my_str.length()) {
                result[i] = my_str.substring(i * n);
            }
            else {
                result[i] = my_str.substring(i*n, (i+1)*n);
            }
        }
        return result;
    }
}
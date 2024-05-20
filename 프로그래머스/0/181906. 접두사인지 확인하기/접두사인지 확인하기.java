class Solution {
    public int solution(String my_string, String is_prefix) {
//        final int PRE_LENGTH = is_prefix.length();
//        if(my_string.length() < PRE_LENGTH) return 0;
//        return my_string.substring(0,PRE_LENGTH).equals(is_prefix)?1:0;

        return my_string.startsWith(is_prefix)?1:0;
    }
}
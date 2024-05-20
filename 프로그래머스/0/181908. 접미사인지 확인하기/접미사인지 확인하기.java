class Solution {
    public int solution(String my_string, String is_suffix) {
        int suffix_length = is_suffix.length();
        if(my_string.length()<is_suffix.length()) return 0;
        return my_string.substring(my_string.length()-suffix_length).equals(is_suffix)?1:0;
    }
}
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        char[] chars = my_string.toCharArray();
        for (char ch : chars) {
            if(Character.isUpperCase(ch)) sb.append(Character.toLowerCase(ch));
            else sb.append(Character.toUpperCase(ch));
        }
        
        return sb.toString();        
    }
}
class Solution {
    public String solution(String my_string, int[] indices) {
       StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            boolean b = false;
            for (int j = 0; j < indices.length; j++) {
                if(i==indices[j]) {
                    b = true;
                    break;
                }
            }
            if(!b) sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}
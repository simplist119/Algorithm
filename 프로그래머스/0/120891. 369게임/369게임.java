class Solution {
    public int solution(int order) {
        String[] strs = Integer.toString(order).split("");
        int count = 0;

        for (String s : strs) {
            if (s.equals("3") || s.equals("6") || s.equals("9")) count++;
        }
        
        return count;
    }
}
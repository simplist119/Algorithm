class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[30];
        int max = 0;

        for (String s : strArr) {
            count[s.length() - 1]++;
        }

        for (int i : count) {
            if(i>max) max =i;
        }
        
        return max;
    }
}
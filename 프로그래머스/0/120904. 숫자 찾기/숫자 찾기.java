class Solution {
    public int solution(int num, int k) {
        String strtemp = num + "";
        int answer = strtemp.indexOf(k + "");

        if(answer == -1) return -1;  
        return answer + 1;      
    }
}
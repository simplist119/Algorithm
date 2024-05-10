class Solution {
    public int solution(int a, int b) {
       
        int case1 = Integer.parseInt(""+a+b);
        int case2 = Integer.parseInt(""+b+a);

        int answer = case1>case2?case1:case2;
        
        return answer;
    }
}
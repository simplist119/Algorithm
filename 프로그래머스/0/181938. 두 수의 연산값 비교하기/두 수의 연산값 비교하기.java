class Solution {
    public int solution(int a, int b) {
        int var1 = Integer.parseInt("" + a + b);
        int var2 = 2 * a * b;
        
        return var1>var2?var1:var2;
    }
}
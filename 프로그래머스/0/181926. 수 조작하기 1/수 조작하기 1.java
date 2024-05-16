class Solution {
    public int solution(int n, String control) {
        
         char[] control2 = control.toCharArray();
        for (char ch : control2) {
            switch (ch) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}
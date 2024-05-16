class Solution {
    public int solution(int slice, int n) {
        int pizza = 0;
        while(true){
            pizza++;
            if(slice * pizza >= n) return pizza;
        }
    }
}
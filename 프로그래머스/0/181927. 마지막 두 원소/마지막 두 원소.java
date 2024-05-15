import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
         
        int[] result = Arrays.copyOf(num_list, num_list.length + 1);
        boolean isBig = num_list[num_list.length-1] > num_list[num_list.length-2];
        
        if (isBig) result[result.length-1] = result[result.length-2] - result[result.length-3];
        else result[result.length-1] = result[result.length-2] * 2;
        
        return result;
    }
}
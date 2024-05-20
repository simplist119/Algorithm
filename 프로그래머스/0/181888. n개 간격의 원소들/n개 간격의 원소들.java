import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List list = new ArrayList();
        for (int i = 0; i < num_list.length; i+=n) {
            list.add(num_list[i]);
        }
        
        int[] intArr = new int[list.size()];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) list.get(i);
        }
        return intArr;
    }
}
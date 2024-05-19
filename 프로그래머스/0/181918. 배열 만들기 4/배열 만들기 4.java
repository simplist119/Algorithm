import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length;) {
            if(list.isEmpty() || list.get(list.size()-1) < arr[i]) {
                list.add(arr[i]);
                i++;
            }
            else{
                list.remove(list.size()-1);
            }
        }
        int[] stk = list.stream().mapToInt(i -> i).toArray();
        return stk;
    }
}

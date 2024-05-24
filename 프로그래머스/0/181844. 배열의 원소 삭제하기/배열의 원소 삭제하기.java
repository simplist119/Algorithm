import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();

        for (int a : arr) {
            boolean any_same = false;
            for (int b : delete_list) {
                if(a==b) {
                    any_same = true;
                    break;
                }
            }
            if(!any_same) list.add(a);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
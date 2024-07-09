import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();

        for (int i : arr) {
            if(i%divisor==0) list.add(i);
        }
        
        if(list.isEmpty()) return new int[]{-1};
        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
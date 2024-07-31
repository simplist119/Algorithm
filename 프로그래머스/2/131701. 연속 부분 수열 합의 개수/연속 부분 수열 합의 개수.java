import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        // System.out.println("elements : " + Arrays.toString(elements));
        int[] temp = new int[elements.length * 2];
        // System.out.println("before temp : " + Arrays.toString(temp));
        System.arraycopy(elements,0,temp,0,elements.length);
        System.arraycopy(elements,0,temp,elements.length,elements.length);
        // System.out.println("after temp : " + Arrays.toString(temp));
        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = 0; j < elements.length; j++) {
                sum += temp[i+j];
                set.add(sum);
                // System.out.println(set);
            }
        }
        return set.size();
    }
}
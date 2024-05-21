import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int start = 0;
        int end = 0;
        int gap = 1;

        switch (n) {
            case 1:
                start = 0;
                end = b;
                gap = 1;
                break;
            case 2:
                start = a;
                end = num_list.length - 1;
                gap = 1;
                break;
            case 3:
                start = a;
                end = b;
                gap = 1;
                break;
            case 4:
                start = a;
                end = b;
                gap = c;
                break;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i = i + gap) {
            list.add(num_list[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
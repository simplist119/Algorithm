import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int work : works) {
            queue.offer(work);
        }

        while (n > 0) {
            int max = queue.poll();
            if (max == 0) return 0;
            queue.offer(max - 1);
            n--;
        }

        long answer = 0L;
        for (int q : queue) {
            answer += (long) Math.pow(q, 2);
        }

        return answer;
    }
}

// class Solution {
//     public long solution(int n, int[] works) {
//         while (n != 0) {
//             Arrays.sort(works);
//             if (works[works.length - 1] == 0) return 0;
//             works[works.length - 1]--;
//             n--;
//         }
        
//         int answer = 0;
//         for (int i = 0; i < works.length; i++) {
//             works[i] = (int) Math.pow(works[i], 2);
//             answer += works[i];
//         }
        
//         return answer;
//     }
// }
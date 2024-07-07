import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        Queue<Integer> q1 = new PriorityQueue<>();
        Queue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());

        for (String op : operations) {
            String[] opTemp = op.split(" ");
            char opChar = opTemp[0].charAt(0);
            int opNum = Integer.parseInt(opTemp[1]);
            if (opChar == 'I') {
                q1.offer(opNum);
                q2.offer(opNum);
            } else if (opChar == 'D') {
                if(q1.isEmpty()) continue;
                else{
                    if(opNum==1) q1.remove(q2.remove());
                    else q2.remove(q1.remove());
                }
            }
        }
        
        int[] answer = new int[]{0,0};
        if(!q1.isEmpty()) answer = new int[]{q2.peek(), q1.peek()};
        return answer;
    }
}
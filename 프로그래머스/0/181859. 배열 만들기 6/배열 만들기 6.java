import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(list.isEmpty()) list.add(arr[i]);
            else if(!list.isEmpty() && list.get(list.size()-1)==arr[i]) list.remove(list.size()-1);
            else if(!list.isEmpty() && list.get(list.size()-1)!=arr[i]) list.add(arr[i]);
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        if(answer.length==0) return new int[]{-1};
        return answer;
    }
}
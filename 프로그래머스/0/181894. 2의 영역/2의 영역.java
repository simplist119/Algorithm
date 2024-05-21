
class Solution {
    public int[] solution(int[] arr) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==2 && first == -1) first = i;
            if(arr[i] ==2) last = i;
        }

        int answer[] = new int[last-first+1];
        
        if(last==-1) {
            answer[0] = -1;
            return answer;
        }
                 
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[first + i];
        }
        return answer;
    }
}
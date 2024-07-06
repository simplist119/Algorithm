class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for (String str : arr) {
            int temp = Integer.parseInt(str);
            if(temp > max) max = temp;
            if(temp < min) min = temp;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min);
        sb.append(" ");
        sb.append(max);

        String answer = sb.toString();
        return answer;
    }
}
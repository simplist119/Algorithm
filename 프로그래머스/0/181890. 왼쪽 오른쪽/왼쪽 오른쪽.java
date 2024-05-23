class Solution {
    public String[] solution(String[] str_list) {
        String direction = "";
        int position = -1;
        String[] empty = new String[]{};
        for (int i=0; i<str_list.length; i++) {
            if(str_list[i].equals("l")||str_list[i].equals("r")) {
                direction = str_list[i];
                position = i;
                break;
            }
        }
        
        if(direction.equals("l")){
            if(position == 0) return empty;
            String[] answer = new String[position];
            for (int i = 0; i < position; i++) {
                answer[i] = str_list[i];
            }
            return answer;
        }
        else if(direction.equals("r")){
            if(position==str_list.length-1) return empty;
            String[] answer = new String[str_list.length - (position + 1)];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = str_list[i + position + 1];
            }
            return answer;
        }
        else return empty;
    }
}
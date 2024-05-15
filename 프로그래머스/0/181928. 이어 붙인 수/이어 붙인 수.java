class Solution {
    public int solution(int[] num_list) {
        //홀수들과 짝수들을 문자열로 이어붙일 StringBuilder를 각각 생성
        StringBuilder even_str = new StringBuilder();
        StringBuilder odd_str = new StringBuilder();

        //매개변수로 넘겨받은 num_list를 순회 하면서 홀수이면 even_str에 짝수이면 odd_str에 이어붙임
        for (int i : num_list) {
            if(i %2 ==1) even_str.append(i);
            else odd_str.append(i);
        }

        //even_str과 odd_str에 있는 문자열을 parseInt를 사용해 정수형으로 변환한뒤 저장
        int even_num = Integer.parseInt(even_str.toString());
        int odd_num = Integer.parseInt(odd_str.toString());

        return even_num + odd_num;
    }
}
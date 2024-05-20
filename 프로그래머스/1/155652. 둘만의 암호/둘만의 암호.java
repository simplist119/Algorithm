import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        // 알파벳(a~z) 리스트 만들기
        String alphabet_str = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet_arr = alphabet_str.toCharArray();
        List<Character> alphabet_list = new ArrayList<>();

        for(Character ch : alphabet_arr){
            alphabet_list.add(ch);
        }

        // skip 에 포함되어 있는 알파벳들 alphabet_list 에서 제거하기
        for(Character ch : skip.toCharArray()){
            alphabet_list.remove(ch);
        }

        // alphabet_list 순회하면서 해당 알파벳의 위치(idx) 파악하고 매개변수(index) 만큼 더하기
        // idx + index > alphabet.length 이면 다시 앞으로 되돌리기
        // (idx+index)%alphabet.length
        StringBuilder sb = new StringBuilder();

        for (Character ch : s.toCharArray()) {
            int idx = alphabet_list.indexOf(ch);
            idx = (idx + index) % alphabet_list.size();
            sb.append(alphabet_list.get(idx));
        }

        return sb.toString();
    }
}
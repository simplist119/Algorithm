import java.util.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        // 공백으로 문자열을 구분하고 공백도 토큰에 포함시키기
        StringTokenizer st = new StringTokenizer(s, " ", true);
        while(st.hasMoreTokens()){
            String temp = st.nextToken();
            char firstOfTemp = temp.charAt(0);
            if(Character.isLowerCase(firstOfTemp)) temp = String.valueOf(firstOfTemp).toUpperCase() + temp.substring(1);
            sb.append(temp);
        }
        return sb.toString();
    }
}
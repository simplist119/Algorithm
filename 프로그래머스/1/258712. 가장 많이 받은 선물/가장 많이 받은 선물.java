import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {

        // 사용하기 편하게 이름과 index 매핑
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }

        // 선물지수 gift_index, 받을 선물 갯수 expect_num
        int[] gift_index = new int[friends.length];
        int[] expect_num = new int[friends.length];

        // 선물지수 계산
        for (String gift : gifts) {
            String[] temp = gift.split(" ");
            gift_index[map.get(temp[0])]++;
            gift_index[map.get(temp[1])]--;

        }
        
        // 받을 선물 갯수 계산
        for (int i = 0; i < friends.length-1; i++) {
            for (int j = i+1; j < friends.length; j++) {
                int count_temp = 0;
                for (String gift : gifts) {
                    if(gift.equals(friends[i] + " " + friends[j])) count_temp++;
                    else if(gift.equals(friends[j] + " " + friends[i])) count_temp--;
                }
                if(count_temp > 0) expect_num[i]++;
                else if(count_temp < 0) expect_num[j]++;
                else {
                    if(gift_index[i] > gift_index[j]) expect_num[i]++;
                    else if(gift_index[i] < gift_index[j]) expect_num[j]++;
                }
            }
        }
        
        // 받은 선물 갯수 (expect_num) 중에서 가장 큰 숫자를 출력
        int max = expect_num[0];
        for (int i : expect_num) {
            if(i> max) max = i;
        }
        return max;
    }
}